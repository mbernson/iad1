package iiad.les6.tree;

public class BinaryTreePrintingDemo {
    public static void main(String[] args) {
        BinaryNode<String> root = new BinaryNode<>("wortel"), child;
        root.add(new BinaryNode<>("kind 1"));

        root.getLeftChild().add(new BinaryNode<>("foo"));

        child = new BinaryNode<>("kind 2");
        root.add(child);

        child.add(new BinaryNode<>("blad 1"));
        child.add(new BinaryNode<>("blad 2"));

        root.print();
    }
}
