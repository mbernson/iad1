package iiad.les5.queue;

/**
 * Created by mathijs on 16-6-2015.
 */
public interface Deque<T> {
    void addFirst(T element);
    void addLast(T element);

    T removeFirst();
    T removeLast();

    T getFirst();
    T getLast();

    int size();
    boolean isEmpty();
}
