package iiad.les1.sorting;

public class QuickSort<T extends Comparable<T>> implements Sortable<T> {

    @Override
    public T[] sort(T[] list) {
        if(list.length == 0)
            return list;

        T x = list[0];

//        final T[] smallerSorted = sort((x, list)),
//                  biggerSorted =  sort((x, list));
        return list;

    }
}
