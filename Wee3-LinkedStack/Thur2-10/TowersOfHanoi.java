public class TowersOfHanoi {
    public static void main(String[] args) {
        Stack<Integer> rod1 = new LinkedStack<>(); // left rod
        Stack<Integer> rod2 = new LinkedStack<>(); // middle
        Stack<Integer> rod3 = new LinkedStack<>(); // right

        rod1.push(3);
        rod1.push(2);
        rod1.push(1);

        System.out.println(rod1);
        System.out.println(rod2);
        System.out.println(rod3);

        // some code to make this work!
    }
}
