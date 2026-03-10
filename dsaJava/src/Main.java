import java.util.*;

public class Main {
    public static void main(String[] args) {
        //linear search: iterate over a collection one element at a time
        //runtime complexity: O(n)

        //efficient with small to medium datasets

        int[] array = {9, 1, 5, 7, 2, 8, 3, 0, 6};
        int index = linearSearch(array, 4);

        if (index != -1) {
            System.out.println("Element found index: " + index);
        }
        else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}