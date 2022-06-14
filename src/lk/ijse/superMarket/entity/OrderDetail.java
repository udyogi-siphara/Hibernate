/**
 * @author : Udyogi Siphara
 * Project Name: HibernateSuperMarket
 * Date        : 6/14/2022
 * Time        : 12:30 PM
 */

package lk.ijse.superMarket.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetail {
    @Id
    private String id;
    @ManyToOne
    private Orders orders;
    @ManyToOne
    private Item item;

    private int qty;
    private double unitPrice;

    public OrderDetail(String id, Orders orders, Item item, int qty, double unitPrice) {
        this.setId(id);
        this.setOrders(orders);
        this.setItem(item);
        this.setQty(qty);
        this.setUnitPrice(unitPrice);
    }

    public OrderDetail() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id='" + id + '\'' +
                ", orders=" + orders +
                ", item=" + item +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
