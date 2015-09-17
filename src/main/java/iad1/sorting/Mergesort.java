package iad1.sorting;

import java.util.Arrays;

public class Mergesort<T extends Comparable<? super T>> implements Sorter<T> {

    private T[] buffer;

    @Override
    public T[] sort(T[] list) {
        // This seems to be the only way to copy a generic array...
        buffer = Arrays.copyOf(list, list.length);
        sort(list, 0, list.length - 1);
        return list;
    }

    private void sort(T[] source, int lo, int hi) {
        if(hi <= lo)
            return;

        int mid = lo + (hi - lo) / 2;
        
        sort(source, lo, mid);
        sort(source, mid + 1, hi);
        merge(source, lo, mid, hi);
    }

    private void merge(T[] source, final int lo, final int mid, final int hi) {
        copy(source, lo, hi);

        int x = lo,
            y = mid + 1;

        for (int index = lo; index <= hi; index++) {
            if(x > mid) {
                source[index] = buffer[y++];
            } else if(y > hi) {
                source[index] = buffer[x++];
            } else if(buffer[y].compareTo(buffer[x]) < 0) {
                source[index] = buffer[y++];
            } else {
                source[index] = buffer[x++];
            }
        }
    }

    private void copy(T[] source, int begin, int end) {
        for (int i = begin; i < end; i++) {
            buffer[i] = source[i];
        }
    }

}
