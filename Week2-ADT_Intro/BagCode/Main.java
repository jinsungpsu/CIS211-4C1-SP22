import java.rmi.UnexpectedException;

public class Main {
    public static void main(String[] args) {

        try {
            Bag bag = new ArrayListBag();
            bag.viewContents(); // this should be empty
            bag.add(90);
            bag.add(100);
            bag.viewContents(); // this should display 90
            bag.removeItem(100);
            bag.viewContents(); // 90
            bag.removeItem(90);
            bag.viewContents(); // this should be empty
            bag.add(90);
            bag.add(100);
            bag.add(90);
        } catch (UnexpectedException e) {
            e.printStackTrace();
        }
    }
}
