package iiad.les5.queue;

import iiad.les2.linearlist.DoublyLinkedList;
import iiad.les2.linearlist.LinkedList;
import iiad.les2.linearlist.List;

public class ListQueue<T> implements Queue<T> {
    private List<T> list;

    public ListQueue() {
        list = new LinkedList<>();
    }

    @Override
    public void enqueue(T element) {
        list.push(element);
    }

    @Override
    public T dequeue() {
        return list.shift();
    }

    @Override
    public T front() {
        return list.get(0);
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
