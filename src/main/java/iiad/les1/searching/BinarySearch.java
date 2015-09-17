package iiad.les1.searching;

public class BinarySearch<T extends Comparable<T>> implements Searchable<T> {

    @Override
    public int search(T[] items, T target) {
        int low = 0,
            mid,
            high = items.length - 1;

        while(low <= high) {
            mid = ( low + high ) / 2;

            if(items[mid].compareTo(target) < 0) {
                low = mid + 1;
            } else if(items[mid].compareTo(target) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return NOT_FOUND;
    }

}
