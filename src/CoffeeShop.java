import java.util.LinkedList;
import java.util.Queue;

public class CoffeeShop {

    private Queue<String> orderQueue; // Shared Variable
    private final int CAPACITY;

    public CoffeeShop(int capacity) {
        this.CAPACITY = capacity;
        this.orderQueue = new LinkedList<>();
    }

    // Customers use this
    public synchronized void placeOrder(String order) {
        while (orderQueue.size() == CAPACITY) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        orderQueue.add(order);
        System.out.println("Placed order: " + order);
        notifyAll();
    }

    // Baristas use this
    public synchronized String prepareOrder() {
        while (orderQueue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        orderQueue.poll();
        String order = Thread.currentThread().getName();
        notifyAll();
        return order;
    }
}
