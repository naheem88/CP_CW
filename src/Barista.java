public class Barista extends Thread {
    private final CoffeeShop coffeeShop;

    public Barista(CoffeeShop coffeeShop) {
        this.coffeeShop = coffeeShop;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 6; i++) {
            String preparedOrder = coffeeShop.prepareOrder();
            System.out.println("Prepared " + preparedOrder + " by " +
                    Thread.currentThread().getName());
            try {
                Thread.sleep(1800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
