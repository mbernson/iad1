package iad1.sorting;

import java.util.Arrays;

public class Mergesort<T extends Comparable<? super T>> implements Sorter<T> {
    @Override
    public T[] sort(T[] list) {
        sort(list, 0, list.length - 1);
        return list;
    }

    private void sort(T[] source, int lo, int hi) {
        if(hi <= lo)
            return;

        final int mid = lo + (hi - lo) / 2;
        sort(source, lo, mid);
        sort(source, mid + 1, hi);
        merge(source, lo, mid, hi);
    }

    private void merge(T[] source, final int lo, final int mid, final int hi) {
        final T[] buffer = Arrays.copyOf(source, source.length);
        int firstCounter = lo,
            secondCounter = mid + 1;

        for (int index = lo; index <= hi; index++) {
            if(firstCounter > mid) {
                source[index] = buffer[secondCounter++];
            } else if(secondCounter > hi) {
                source[index] = buffer[firstCounter++];
            } else if(buffer[secondCounter].compareTo(buffer[firstCounter]) < 0) {
                source[index] = buffer[secondCounter++];
            } else {
                source[index] = buffer[firstCounter++];
            }
        }
    }

}
