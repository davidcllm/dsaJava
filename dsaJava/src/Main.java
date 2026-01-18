import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Linked List

        LinkedList<String> linkedList = new LinkedList<String>();

        // con push el orden es: F, D, C, B, A
        // pop elimina F
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();

        System.out.println(linkedList);

    }
}