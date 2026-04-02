import java.util.*;

public class Main {
    public static void main(String[] args) {
        //insertion sort: after comparing elements to the left
        //shift elements to the right to make room to insert a value

        //complexity: O(n^2)
        //small data set: decent
        //big data set: bad

        //Best case O(n)

        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        insertionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}