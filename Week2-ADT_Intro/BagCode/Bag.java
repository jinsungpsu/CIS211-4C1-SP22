import java.rmi.UnexpectedException;

public interface Bag {
    public void add(int something) throws UnexpectedException;

    public void viewContents();

    public void removeItem(int something) throws UnexpectedException;

    public int removeRandom();
}
