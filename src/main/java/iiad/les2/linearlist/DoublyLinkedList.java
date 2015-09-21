package iiad.les2.linearlist;

import java.util.Iterator;

public class DoublyLinkedList<E> implements List<E> {

    private Entry head = null,
                  tail = null;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E object) {
        Iterator<E> iter = this.iterator();
        while(iter.hasNext()) {
            E item = iter.next();
            if(item.equals(object)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new DoublyLinkedListIterator();
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[size];
        if(isEmpty()) {
            return arr;
        }
        Entry temp = tail;
        for(int i = 0; i < size; i++) {
            arr[i] = temp.getElement();
            temp = temp.getNext();
        }
        return arr;
    }

    @Override
    public boolean remove(E object) {
        return false;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        if (null == tail) {
            return null;
        }
        Entry temp = tail;
        for(int i = 0; i < index; i++) {
            if (null == temp)
                return null;
            temp = temp.getNext();
        }
        return temp.getElement();
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(E object) {
        return 0;
    }

    @Override
    public void push(E element) {
        size++;
        Entry entry = new Entry(element);
        if (null == head) {
            head = tail = entry;
            return;
        }
        entry.setPrevious(head);
        head.setNext(entry);
        head = entry;
    }

    @Override
    public void add(E element) {
        push(element);
    }

    @Override
    public E pop() {
        if (null == head) {
            return null;
        }
        E element = head.getElement();
        head = head.getPrevious();
        size--;
        return element;
    }

    @Override
    public E shift() {
        if (null == tail) {
            return null;
        }
        E element = tail.getElement();
        tail = tail.getNext();
        size--;
        return element;
    }

    @Override
    public void unshift(E element) {
        Entry entry = new Entry(element);
        if (null == tail) {
            head = tail = entry;
            return;
        }
        entry.setNext(tail);
        tail.setPrevious(entry);
        tail = entry;
        size++;
    }

    final private class Entry {

        private Entry next = null,
                previous = null;
        private E element;

        public Entry(E element) {
            this.element = element;
        }

        public Entry() { }

        public E getElement() {
            return element;
        }

        public Entry getNext() {
            return next;
        }

        public Entry getPrevious() {
            return previous;
        }

        public void setNext(Entry next) {
            this.next = next;
        }

        public void setPrevious(Entry previous) {
            this.previous = previous;
        }
    }

    final private class DoublyLinkedListIterator implements Iterator<E> {

        private Entry position = tail;

        @Override
        public boolean hasNext() {
            return (position != null);
        }

        @Override
        public E next() {
            if (null == position) {
                return null;
            }
            Entry temp = position;
            position = temp.getNext();
            return temp.getElement();
        }
    }
}
