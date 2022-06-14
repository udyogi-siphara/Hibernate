/**
 * @author : Udyogi Siphara
 * Project Name: HibernateSuperMarket
 * Date        : 6/14/2022
 * Time        : 11:26 AM
 */

package lk.ijse.superMarket.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {
    @Id
    private String code;
    private String description;
    private double unitPrice;
    private int qtyOnHand;


    @OneToMany(mappedBy = "item")
    private List<OrderDetail> orderDetailsList = new ArrayList<>();


    public Item() {
    }

    public Item(String code, String description, double unitPrice, int qtyOnHand) {
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
    }

    public Item(String code, String description, double unitPrice, int qtyOnHand, List<OrderDetail> orderDetailsList) {
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
        this.orderDetailsList = orderDetailsList;
    }

    public List<OrderDetail> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetail> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ", qtyOnHand=" + qtyOnHand +
                ", orderDetailsList=" + orderDetailsList +
                '}';
    }
}
