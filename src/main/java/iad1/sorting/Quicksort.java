package iad1.sorting;

public class Quicksort<T extends Comparable> {
    private final T[] items;

    public Quicksort(T[] items) {
        this.items = items;
    }

    public T[] sort() {
        return items;
    }
}
