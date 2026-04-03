import java.util.*;

public class Main {
    public static void main(String[] args) {
        //recursion: A recursive method calls itself.
        //adv: easier to read/write, easier to debug
        //disad: sometimes slower, uses more memory

        //walk(5);
        recursiveWalk(5);
    }

    private static void recursiveWalk(int steps) {
        if (steps < 1) return; //base case: stop
        System.out.println("You take a step!");
        walk(steps - 1);
    }

    private static void walk(int steps) {
        for (int i = 0; i < steps; i++) {
            System.out.println("You take a step!");
        }
    }

}