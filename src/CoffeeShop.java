import java.util.LinkedList;
import java.util.Queue;

public class CoffeeShop {
    private final Queue<String> orderQueue;
    private final int capacity;

    public CoffeeShop(int capacity) {
        this.capacity = capacity;
        this.orderQueue = new LinkedList<>();
    }

    // Customers use this
    public synchronized void placeOrder(String order) {
        while (orderQueue.size() == capacity) {
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

        String order = orderQueue.poll();
        notifyAll();
        return order;
    }
}
