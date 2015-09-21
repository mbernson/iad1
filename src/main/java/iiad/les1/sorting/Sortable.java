package iiad.les1.sorting;

public interface Sortable<T extends Comparable<T>> {
    /**
     * Sort the list, returning a new list
     * containing the elements in ascending order.
     * @param list
     * @return
     */
    T[] sort(T[] list);
}
