public class Customer implements Runnable {

    private final CoffeeShop coffeeShop;
    private final String order;

    public Customer(CoffeeShop coffeeShop, String order) {
        this.coffeeShop = coffeeShop;
        this.order = order;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            coffeeShop.placeOrder(order);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
