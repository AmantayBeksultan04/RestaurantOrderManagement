import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Restaurant {
    private String name;
    private List<MenuItem> menu = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    // SEARCH
    public MenuItem findMenuItemByName(String name) {
        for (MenuItem item : menu) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    // FILTER
    public List<Order> filterOrdersByMinPrice(double minPrice) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getTotalPrice() >= minPrice) {
                result.add(order);
            }
        }
        return result;
    }

    // SORT
    public void sortOrdersByPrice() {
        orders.sort(Comparator.comparingDouble(Order::getTotalPrice));
    }

    public void displayOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

