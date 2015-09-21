package iiad.les2.stack;

public interface Stack<E> {
    E pop();
    E peek();
    void push(E element);

    int size();
    boolean isEmpty();
}
