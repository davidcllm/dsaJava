import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Linked List: good with insertion and deletion of nodes.

        LinkedList<String> linkedList = new LinkedList<String>();

        // Como con los stacks
        // con push el orden es: F, D, C, B, A
        // pop elimina F
        /*linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();*/

        // Como con las queues
        // con offer el orden es: A, B, C, D, F
        // poll elimina la A
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.poll();

        linkedList.add(4, "E");
        System.out.println(linkedList);

        System.out.println(linkedList.indexOf("E"));

        linkedList.remove("E");
        System.out.println(linkedList);

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("Z");
        System.out.println(linkedList);
    }
}