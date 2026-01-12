import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //stack: LIFO, is likee a pile of plates

        Stack<String> stack = new Stack<String>();
        //System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        //System.out.println(stack.empty());
        System.out.println(stack);

        String myFavGame = stack.pop();
        System.out.println(myFavGame);
    }
}