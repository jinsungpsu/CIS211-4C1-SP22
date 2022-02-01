import java.rmi.UnexpectedException;

public class StupidBag implements Bag{
    private final int CAPACITY = 2;
    private int num1;
    private int num2;
    private int numItems = 0;

    public StupidBag() {
        // no arg is implicitly in every class
    }

    @Override
    public void add(int something) throws UnexpectedException {
        if (numItems < CAPACITY) {
            if (numItems == 1) {
                this.num2 = something;
            } else {
                this.num1 = something;
            }
            numItems++;
        } else {
            // error, bag is "full"
            throw new UnexpectedException("Cannot add, because bag is full.");
        }
    }

    @Override
    public void viewContents() {
        if (numItems==0) {
            System.out.println("Nothing to see here...");
        } else {
            if (numItems==1) {
                System.out.println("Contents of this bag: " + this.num1);
            } else if (numItems ==2) {
                System.out.println("Contents of this bag: " + this.num1 + ", " + this.num2);
            }
        }
    }

    @Override
    public void removeItem(int something) throws UnexpectedException {
        if (numItems==0) {
            throw new UnexpectedException("Bag is empty, so I can't find that number.");
        } else if (something == num1) {
            numItems--;
            num1 = num2;
            num2 = 0;
        } else if (something == num2) {
            numItems--;
            num2 = 0;
        } else {
            throw new UnexpectedException("Bag is not empty, but number you are trying to remove can't be found");
        }


    }

    @Override
    public int removeRandom() {
        return 0;
    }
}
