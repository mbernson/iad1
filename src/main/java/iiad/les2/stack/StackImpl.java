package iiad.les2.stack;

public class StackImpl<E> implements Stack<E> {
    private Entry tail;
    private int size = 0;

    @Override
    public E pop() {
        if (null == tail) {
            return null;
        }
        Entry temp = tail;
        tail = temp.getPrevious();
        size--;
        return temp.getElement();
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    @Override
    public void push(E element) {
        size++;
        Entry entry = new Entry(element, tail);
        tail = entry;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private final class Entry {
        private Entry previous;
        private E element;

        public Entry(E element, Entry previous) {
            this.element = element;
            this.previous = previous;
        }

        public Entry getPrevious() {
            return previous;
        }

        public void setPrevious(Entry previous) {
            this.previous = previous;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }
    }
}
