package iiad.les1.searching;

public class LinearSearch<T> implements Searchable<T> {

    @Override
    public int search(T[] items, T target) {
        int index = 0;
        for(T item : items) {
            if(item.equals(target))
                return index;
            index++;
        }
        return NOT_FOUND;
    }

}
