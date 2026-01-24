import java.util.*;

public class Main {
    public static void main(String[] args) {
        // LinkedList vs ArrayList

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // LinkedList
        startTime = System.nanoTime();
        //do something
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("LinkedList: " + elapsedTime + " ns");
    }
}