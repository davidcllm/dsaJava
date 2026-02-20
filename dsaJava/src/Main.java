import java.util.*;

public class Main {
    public static void main(String[] args) {
        // LinkedList vs ArrayList

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;


        //Insert a lot of elements
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // ------LinkedList
        startTime = System.nanoTime();

        //linkedList.get(0);
        linkedList.get(999999);

        endTime = System.nanoTime();

        //Calculate elapsed time
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList: " + elapsedTime + " ns");

        // ------Array List
        startTime = System.nanoTime();

        //arrayList.get(0);
        arrayList.get(999999);

        endTime = System.nanoTime();

        //Calculate elapsed time
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList: " + elapsedTime + " ns");
    }
}