public class StackTester {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStackTopRight<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        //stack.push(6); // this one should blow up...
    }
}
