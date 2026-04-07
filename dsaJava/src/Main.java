import java.util.*;

public class Main {
    public static void main(String[] args) {
        //merge sort
        //Complexity:

        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[middle];

        int i = 0; //left
        int j = 0; //right

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            }
            else {
                rightArray[i] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

    }


}