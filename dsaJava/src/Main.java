import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Priority queue: FIFO structure,
        // serves the elements with higher priority first

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);
        queue.offer(1.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}