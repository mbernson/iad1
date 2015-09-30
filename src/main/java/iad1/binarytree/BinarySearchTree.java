package iad1.binarytree;

public class BinarySearchTree<K extends Comparable<K>, V> {
    private Node<K, V> root;

    public int size() {
        return size(root);
    }

    private int size(Node<K, V> node) {
        if(null == node) return 0;
        else             return node.children;
    }

    public V get(K key) {
        return null;
    }

    public void put(K key, V value) {
        put(new Node<>(key, value));
    }

    private void put(Node<K, V> node) {

    }

    public void print() {

    }

    class Node<K extends Comparable<K>, V> implements Comparable<Node<K, V>> {
        K key;
        V value;

        Node<K, V> leftChild, rightChild;
        int children = 0;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(Node<K, V> other) {
            return this.key.compareTo(other.key);
        }

        public void addChild(final Node<K, V> child) {
        }
    }
}
