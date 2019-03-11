package homeworkx;

import java.io.Serializable;
import java.util.List;

public class OrdersContainer implements Serializable {
    private List<Orders> orders;

    public OrdersContainer(List<Orders> orders) {
        this.orders = orders;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
