import java.util.*;

public class Main {
    public static void main(String[] args) {
        //recursion: A recursive method calls itself.
        //adv: easier to read/write, easier to debug
        //disad: sometimes slower, uses more memory


        System.out.println(factorial(7));
    }
    private static int factorial(int num) {
        if(num < 1) return 1;
        return num * factorial(num - 1);
    }

}