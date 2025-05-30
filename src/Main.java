import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        StackLinkedList<Object> stack = new StackLinkedList<>();
        stack.push(3);
        stack.push(45);
        stack.push(3.4);
        stack.push(3.4);
        stack.push(true);
        stack.displayStack();
        //System.out.println(stack);
    }

}
}

       //