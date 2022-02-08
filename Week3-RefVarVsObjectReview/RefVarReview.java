public class RefVarReview {
    public static void main(String[] args) {
        Car honda = new Car("Honda", "Civic");
        Car toyota = new Car("Toyota", "Tundra");

        Car mohamed = new Car("Mohamed", "Ibrahim");

        mohamed = toyota;

        toyota = honda;

        honda.setMake("Tesla");

        System.out.println(honda);
        System.out.println(toyota);
        System.out.println(mohamed);

        /*
        Tesla Civic
        Toyota Tundra +3

        Tesla Civic
        Honda Civic +1

        T C
        T C

        H C
        T T

         */
    }
}

