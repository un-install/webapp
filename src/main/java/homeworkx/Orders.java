package homeworkx;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@XmlRootElement(name = "Order")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonPropertyOrder({ "orderNum", "date", "cust", "rep", "mfr", "product", "qty", "amount"})
public class Orders implements Serializable {

    @XmlElement(nillable = false, required = true)
    private double orderNum;
    @XmlElement
    private Date date;
    @XmlElement(required = true, nillable = false)
    private double cust;
    @XmlElement
    private double rep;
    @XmlElement(required = true, nillable = false)
    private String mfr;
    @XmlElement
    private double product;
    @XmlElement
    private double qty;
    @XmlElement(required = true, nillable = false)
    private double amount;

    public Orders() {
    }

    public Orders(double orderNum) {
        this.orderNum = orderNum;
    }

    public Orders(double orderNum, Date date, double cust, double rep, String mfr, double qty, double amount,  double product) {
        this.orderNum = orderNum;
        this.date = date;
        this.cust = cust;
        this.rep = rep;
        this.mfr = mfr;
        this.product = product;
        this.qty = qty;
        this.amount = amount;
    }

    public double getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(double orderNum) {
        this.orderNum = orderNum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getCust() {
        return cust;
    }

    public void setCust(double cust) {
        this.cust = cust;
    }

    public double getRep() {
        return rep;
    }

    public void setRep(double rep) {
        this.rep = rep;
    }

    public String getMfr() {
        return mfr;
    }

    public void setMfr(String mfr) {
        this.mfr = mfr;
    }

    public double getProduct() {
        return product;
    }

    public void setProduct(double product) {
        this.product = product;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static List<Orders> getOrdersSet(){
        List<Orders> orders = new ArrayList<>();

        orders.add(new Orders(1,  new Date(12, 11, 2012), 101, 201, "Sony", 14501, 1314, 4114));
        orders.add(new Orders(2,  new Date(12, 11, 2012), 114, 100, "Sony", 24211, 56747, 4115));
        orders.add(new Orders(3,  new Date(12, 11, 2012), 101, 2011, "Razer", 1314, 1314, 4116));
        orders.add(new Orders(4,  new Date(12, 11, 2012), 108, 20, "4Tech", 5555, 25999, 4117));
        orders.add(new Orders(5,  new Date(12, 11, 2012), 104, 201, "Zanusi", 6154, 3400, 4118));
        orders.add(new Orders(6,  new Date(12, 11, 2012), 106, 203, "Lenovo", 3123, 5000, 4119));

        return orders;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderNum=" + orderNum +
                ", date=" + date +
                ", cust=" + cust +
                ", rep=" + rep +
                ", mfr='" + mfr + '\'' +
                ", product=" + product +
                ", qty=" + qty +
                ", amount=" + amount +
                '}';
    }
}
