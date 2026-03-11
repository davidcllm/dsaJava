import java.util.*;

public class Main {
    public static void main(String[] args) {
        //binary search: half of the array is eliminated in each step
        //efficient with large datasets O(log n)

        int array[] = new int[100];
        int target = 42;

        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = Arrays.binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element found at: " + index);
        }

    }
}