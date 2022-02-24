public class Flight {
    private String airline;
    private int flight;

    public Flight(String airline, int flight) {
        this.airline = airline;
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline='" + airline + '\'' +
                ", flight=" + flight +
                '}';
    }
}
