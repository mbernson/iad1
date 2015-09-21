package iiad.les5.queue;

import iiad.les2.linearlist.DoublyLinkedList;
import iiad.les2.linearlist.List;

/**
 * Created by mathijs on 16-6-2015.
 */
public class ListDeque<T> implements Deque<T> {
    private List<T> list;

    public ListDeque() {
        list = new DoublyLinkedList<>();
    }

    @Override
    public void addFirst(T element) {
        list.unshift(element);
    }

    @Override
    public void addLast(T element) {
        list.push(element);
    }

    @Override
    public T removeFirst() {
        return list.shift();
    }

    @Override
    public T removeLast() {
        return list.pop();
    }

    @Override
    public T getFirst() {
        return list.get(0);
    }

    @Override
    public T getLast() {
        return list.get(list.size() - 1);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
