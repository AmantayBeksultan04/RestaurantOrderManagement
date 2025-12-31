public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Food Paradise");

        MenuItem burger = new MenuItem(1, "Burger", 5.99);
        MenuItem pizza = new MenuItem(2, "Pizza", 8.49);

        restaurant.addMenuItem(burger);
        restaurant.addMenuItem(pizza);

        Customer john = new Customer("John");
        Customer anna = new Customer("Anna");

        Order o1 = new Order(101, burger, 2, john);
        Order o2 = new Order(102, pizza, 1, anna);
        Order o3 = new Order(103, pizza, 3, john);

        restaurant.addOrder(o1);
        restaurant.addOrder(o2);
        restaurant.addOrder(o3);

        System.out.println("🔹 All Orders:");
        restaurant.displayOrders();

        System.out.println("\n🔹 Orders above $10:");
        for (Order o : restaurant.filterOrdersByMinPrice(10)) {
            System.out.println(o);
        }

        System.out.println("\n🔹 Orders sorted by price:");
        restaurant.sortOrdersByPrice();
        restaurant.displayOrders();
    }
}

