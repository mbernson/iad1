package iad1.sorting;

public interface Sorter<T extends Comparable<? super T>> {
    T[] sort(T[] list);
}
