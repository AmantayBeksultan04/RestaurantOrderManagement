public class Order {
    private int orderId;
    private MenuItem menuItem;
    private int quantity;

    public Order(int orderId, MenuItem menuItem, int quantity) {
        this.orderId = orderId;
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return menuItem.getPrice() * quantity;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        menuItem.displayItem();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + calculateTotal());
    }
}
