import java.util.Objects;

public class Order {
    private int orderId;
    private MenuItem item;
    private int quantity;
    private Customer customer;

    public Order(int orderId, MenuItem item, int quantity, Customer customer) {
        this.orderId = orderId;
        this.item = item;
        this.quantity = quantity;
        this.customer = customer;
    }

    public double getTotalPrice() {
        return item.getPrice() * quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "Order{id=" + orderId +
                ", item=" + item.getName() +
                ", quantity=" + quantity +
                ", total=" + getTotalPrice() +
                ", customer=" + customer.getName() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }
}

