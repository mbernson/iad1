package iad1.sorting;

public class Quicksort<T extends Comparable> {
    private final T[] items;

    public Quicksort(T[] items) {
        this.items = items;
    }

    public T[] sort() {
        return quicksort(items);
    }

    private T[] quicksort(T[] items) {
        if(items.length <= 1) {
            return items;
        }

        return items;
    }

    private T[] slice(T[] items) {
        return null;
    }
}
