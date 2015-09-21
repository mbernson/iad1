package iiad.les1.searching;

public interface Searchable<T> {
    int NOT_FOUND = -1;

    /**
     * Search an array of items for the target item,
     * returning the index of the item, or -1
     * if it is not present in the array.
     *
     * @param items
     * @param target
     * @return
     */
    int search(T[] items, T target);
}
