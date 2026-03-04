import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Big O notation
    }
    // O(n)
    int addUp(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Mismo resultado, pero O(1)
    int add(int n) {
        int sum = n*(n+1)/2;
        return sum;
    }
}