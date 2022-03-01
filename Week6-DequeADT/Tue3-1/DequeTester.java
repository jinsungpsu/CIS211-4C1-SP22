public class DequeTester {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedDeque<>();
        System.out.println(deque.size());
        deque.offerFirst(1);
        System.out.println(deque.size());
        deque.offerFirst(2);
        System.out.println(deque.size());
    }
}
