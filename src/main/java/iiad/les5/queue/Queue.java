package iiad.les5.queue;

/**
 * A FIFO queue
 * @param <T>
 */
public interface Queue<T> {
    void enqueue(T element);
    T dequeue();
    T front();
    int size();
    boolean isEmpty();
}
