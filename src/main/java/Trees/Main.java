package Trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.put("B", 4);
        bst.put("A", 3);
        bst.put("C", 5);

        int str = (int) bst.get("C");
    }
}
