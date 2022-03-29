import java.util.Scanner;

public class TreeMain {
    public static void main(String[] args) {
        LinkedTreeNode<Integer> root = new LinkedTreeNode<>(1);

        root.getChildren().add(new LinkedTreeNode<Integer>(2));
        root.getChildren().add(new LinkedTreeNode<Integer>(3));
        root.getChildren().add(new LinkedTreeNode<Integer>(4));
        root.getChildren().add(new LinkedTreeNode<Integer>(4));

        root.getChildren().get(3).getChildren().add(new LinkedTreeNode<Integer>(5));

        Scanner input = new Scanner(System.in);
        while(true) {
            int num = input.nextInt();
            if (root.contains(num)) {
                System.out.println("Found");
            } else {
                System.out.println("Not found!");
            }
        }
    }
}
