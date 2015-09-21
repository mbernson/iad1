package iiad.les2.linearlist;

import java.util.Iterator;

public class LinkedList<E> implements List<E> {

    private Entry head = null;
    private int size = 0;

    public void add(E element) {
        if(null == head)
            addFirst(element);
        else
            appendNext(element, head);
        size++;
    }

    private boolean addFirst(E element) {
        head = new Entry(element);
        return true;
    }

    private boolean appendNext(E element, Entry entry) {
        if(entry.hasNext())
            appendNext(element, entry.getNext());
        else
            entry.next = new Entry(element);
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E o) {
        Iterator<E> i = iterator();
        while(i.hasNext()) {
            E element = i.next();
            if(element.equals(o))
                return true;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[size];
        if(isEmpty()) {
            return arr;
        }
        Entry temp = head;
        for(int i = 0; i < size; i++) {
            arr[i] = temp.getElement();
            temp = temp.getNext();
        }
        return arr;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        Entry temp, pos = head;
        if(null == head) return null;
        for(int i = 0; i < index; i++) {
            temp = pos;
            pos = temp.getNext();
            if(pos == null) return null;
        }
        return pos.getElement();
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public void push(E element) {
        add(element);
    }

    private Entry getTail() {
        if(null == head) {
            return null;
        }
        Entry temp = head;
        while(temp.hasNext()) {
            temp = temp.getNext();
        }
        return temp;
    }

    @Override
    public E pop() {
        if(null == head) {
            return null;
        }
        Entry temp = head, previous = null;
        while(temp.hasNext()) {
            previous = temp;
            temp = temp.getNext();
        }
        if(null == previous)
            head = null;
        else
            previous.next = null;
        size--;
        return temp.getElement();
    }

    @Override
    public E shift() {
        if(null == head) {
            return null;
        }

        Entry temp = head;
        head = temp.getNext();
        size--;

        return temp.getElement();
    }

    @Override
    public void unshift(E element) {
        Entry temp = head;
        head = new Entry(element, temp);
        size++;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    final private class Entry {
        private E element;
        private Entry next;

        public Entry(E element) {
            this.element = element;
            next = null;
        }

        private Entry(E element, Entry next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Entry getNext() {
            return next;
        }

        public boolean hasNext() {
            return null != next;
        }
    }

    final private class LinkedListIterator implements Iterator<E> {
        private Entry position = head;

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
