package iad1.sorting;

public class Quicksort<T extends Comparable<? super T>> implements Sorter<T> {
    public T[] sort(T[] list) {
        return sort(list, 0, list.length - 1);
    }

    private T[] sort(T[] list, int low, int high) {
        if(low < high) {
            final int pivot_location = partition(list, low, high);
            sort(list, low, pivot_location - 1);
            sort(list, pivot_location + 1, high);
        }
        return list;
    }

    private int partition(T[] list, int low, int high) {
        final T pivot = list[low];
        int leftWall = low;

        for (int i = low + 1; i <= high; i++) {
            if(list[i].compareTo(pivot) < 0) {
                leftWall++;
                swap(list, i, leftWall);
            }
        }
        swap(list, low, leftWall);
        return leftWall;
    }

    private void swap(Comparable[] list, int x, int y) {
        final Comparable temp = list[x];
        list[x] = list[y];
        list[y] = temp;
    }
}
