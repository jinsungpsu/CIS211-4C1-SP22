import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;

public class ArrayListBag implements Bag {
    private List<Integer> bagContents = new ArrayList<>();

    @Override
    public void add(int something) throws UnexpectedException {
        bagContents.add(something);
    }

    @Override
    public void viewContents() {

    }

    @Override
    public void removeItem(int something) throws UnexpectedException {

    }

    @Override
    public int removeRandom() {
        return 0;
    }
}
