import java.util.*;

public class Main {
    public static void main(String[] args) {
        //recursion: A recursive method calls itself.
        //adv: easier to read/write, easier to debug
        //disad: sometimes slower, uses more memory

        System.out.println(power(2, 8));
    }

    private static int power(int base, int exp) {
        if (exp < 1) return 1;
        return base*power(base, exp-1);
    }

}