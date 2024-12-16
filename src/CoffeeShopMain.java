public class CoffeeShopMain {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop(8);

        Thread customer1 = new Thread(new Customer(coffeeShop, ""), "Customer 1");
        Thread customer2 = new Thread(new Customer(coffeeShop, ""), "Customer 2");
        Thread customer3 = new Thread(new Customer(coffeeShop, ""), "Customer 3");
        Thread customer4 = new Thread(new Customer(coffeeShop, ""), "Customer 4");

        Thread barista1 = new Thread(new Barista(coffeeShop));
        Thread barista2 = new Thread(new Barista(coffeeShop));

        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();

        barista1.start();
        barista2.start();
    }
}