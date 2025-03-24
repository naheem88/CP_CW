public class CoffeeShopMain {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop(8);

        Thread customer1 = new Customer(coffeeShop, "Espresso");
        customer1.setName("Customer 1");

        Thread customer2 = new Customer(coffeeShop, "Cappuccino");
        customer2.setName("Customer 2");

        Thread customer3 = new Customer(coffeeShop, "Latte");
        customer3.setName("Customer 3");

        Thread customer4 = new Customer(coffeeShop, "Iced coffee");
        customer4.setName("Customer 4");

        Thread barista1 = new Barista(coffeeShop);
        barista1.setName("Barista 1");

        Thread barista2 = new Barista(coffeeShop);
        barista2.setName("Barista 2");

        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();

        barista1.start();
        barista2.start();
    }
}