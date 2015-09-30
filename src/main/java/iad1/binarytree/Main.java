package iad1.binarytree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
        Integer[] numbers = { 2, 9, 6, 1, 4, 20, 25, 10 };
        for (Integer n : numbers) {
            tree.put(n, "Hoi");
        }
        tree.print();
    }
}
