

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.addNode(9);
        tree.addNode(3);
        tree.addNode(2);
        tree.addNode(4);
        tree.addNode(7);
        tree.addNode(6);
        tree.addNode(8);

        System.out.println("Lowest Common Ancestor (9,3) " + tree.lca(9, 3).key);
    }
}
