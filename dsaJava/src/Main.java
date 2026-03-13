import java.util.*;

public class Main {
    public static void main(String[] args) {
        //interpolation search: improvement over binary s used for uniformly
        //distributed data, "guesses".

        //average case: O(log(log(n)))
        //worst case: O(n) [values increase exponentially]

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = interpolationSearch(array, 8);



    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;

        while (value >= array[low] && value <= array[high] && low <= high) {

        }


        return 0;
    }

}