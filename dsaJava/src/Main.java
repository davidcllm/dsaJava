import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //queue: FIFO structure

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        //System.out.println(queue);

        //System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);
    }
}