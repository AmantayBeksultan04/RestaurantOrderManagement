public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Freddy Fazzbear Pizzeria", "Los Angeles");
        restaurant.displayRestaurant();
        System.out.println();

        MenuItem item1 = new MenuItem(1, "Burger", 5.99);
        MenuItem item2 = new MenuItem(2, "Pizza", 8.49);

        item1.displayItem();
        item2.displayItem();
        System.out.println();

        Order order1 = new Order(101, item1, 2);
        Order order2 = new Order(102, item2, 1);

        order1.displayOrder();
        System.out.println();
        order2.displayOrder();
        System.out.println();

        if (order1.calculateTotal() > order2.calculateTotal()) {
            System.out.println("Order 1 is more expensive than Order 2");
        } else {
            System.out.println("Order 2 is more expensive than Order 1");
        }
    }
}
