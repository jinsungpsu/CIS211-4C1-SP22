public class RunwaySim {
    public static void main(String[] args) {
        Queue<Flight> runway1 = new ArrayQueue<>();
        Queue<Flight> runway2 = new ArrayQueue<>();

        runway1.enqueue(new Flight("AA", 1127));
        runway1.enqueue(new Flight("SW", 143));
        runway1.enqueue(new Flight("AA", 273));

        runway2.enqueue(new Flight("AA", 327));
        runway2.enqueue(new Flight("SW", 1403));
        runway2.enqueue(new Flight("AA", 2373));


    }
}
