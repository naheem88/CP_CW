public class Customer extends Thread {
    private final CoffeeShop coffeeShop;
    private final String orderName;

    public Customer(CoffeeShop coffeeShop, String orderName) {
        this.coffeeShop = coffeeShop;
        this.orderName = orderName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            String order = this.orderName + " for " + Thread.currentThread().getName();
            coffeeShop.placeOrder(order);
            try {
                Thread.sleep(1600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
