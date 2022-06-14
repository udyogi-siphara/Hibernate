/**
 * @author : Udyogi Siphara
 * Project Name: HibernateSuperMarket
 * Date        : 6/14/2022
 * Time        : 11:11 AM
 */

package lk.ijse.superMarket.util;

import lk.ijse.superMarket.entity.Customer;
import lk.ijse.superMarket.entity.Item;
import lk.ijse.superMarket.entity.OrderDetail;
import lk.ijse.superMarket.entity.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Orders.class)
                .addAnnotatedClass(OrderDetail.class);

        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return factoryConfiguration==null? factoryConfiguration = new FactoryConfiguration():factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
