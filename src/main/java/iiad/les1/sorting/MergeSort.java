package iiad.les1.sorting;

import java.lang.reflect.Array;

public class MergeSort<T extends Comparable<T>> implements Sortable<T> {

    @Override
    public T[] sort(T[] list) {
        if(list.length <= 1)
            return list;

        T[] result = list;

        if(list.length % 2 == 0) {
        } else {
        }

        return result;
    }

    public T[] newArray(Class<T> klass, int length) {
        @SuppressWarnings("unchecked")
        final T[] array = (T[]) Array.newInstance(klass, length);
        return array;
    }

    private T[] a, b, result;
    private void mergeSort(T[] a, T[] b, T[] c) {

    }

}
