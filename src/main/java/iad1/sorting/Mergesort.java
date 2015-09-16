package iad1.sorting;

import java.util.Arrays;

public class Mergesort<T extends Comparable<? super T>> implements Sorter<T> {
    @Override
    public T[] sort(T[] source) {
        T[] target = Arrays.copyOf(source, source.length);

        int begin = 0;
        int end = source.length;
        int mid = source.length / 2;


        sort(source, target, begin, mid, end);

        return target;
    }

    private void sort(T[] source, T[] target, int begin, int mid, int end) {
        int aptr = 0, bptr = mid;
        T a, b;

        for (int i = begin; i < end; i++) {
            a = source[aptr];
            b = source[bptr];

            if(a.compareTo(b) < 0 && aptr < mid) {
                target[i] = a;
                aptr++;
            } else {
                target[i] = b;
                bptr++;
            }
        }
    }
}
