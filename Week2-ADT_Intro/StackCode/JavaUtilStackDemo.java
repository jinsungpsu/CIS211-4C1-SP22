import java.util.Stack;

public class JavaUtilStackDemo {
    public static void main(String[] args) {
        Stack<Integer> numStack = new Stack<>();

        numStack.push(1);
        numStack.push(2);
        numStack.push(3);
        numStack.push(4);
        numStack.push(5);

        System.out.println(numStack);

        int thingPopped = numStack.pop();

        System.out.println(numStack);
        System.out.println(numStack.peek());

        System.out.println(numStack.pop());
        System.out.println(numStack);

    }
}
