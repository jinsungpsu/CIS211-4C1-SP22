public class LinkedStackDriver {
    public static void main(String[] args) {
        Stack<String> wordStack = new LinkedStack<>();
        wordStack.push("Hello");
        wordStack.push("World");
        wordStack.push("What's up?");

        System.out.println(wordStack);


    }
}
