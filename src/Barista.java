public class Barista implements Runnable {

    private final CoffeeShop coffeeShop;

    public Barista(CoffeeShop coffeeShop) {
        this.coffeeShop = coffeeShop;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            String preparedOrder = coffeeShop.prepareOrder();
            System.out.println("Prepared " + preparedOrder);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
