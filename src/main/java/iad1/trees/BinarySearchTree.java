package iad1.trees;

public class BinarySearchTree<K extends Comparable<? super K>, V> {
    private Node root;

    private class Node {
        private K key;
        private V value;
        private Node left, right;
        private int children;

        public int size() {
            return size(root);
        }

        private int size(Node node) {
            if(null == node) return 0;
            else return node.children;
        }

        public V get(K key) {
            return null;
        }

        public void put(K key, V value) {
        }
    }
}
