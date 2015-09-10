package iad1.sorting;

public class Bubblesort<T extends Comparable<? super T>> implements Sorter<T> {
    @Override
    public Comparable[] sort(Comparable[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if(list[j].compareTo(list[j + 1]) > 0) {
                    swap(list, j, j + 1);
                }
            }
        }
        return list;
    }

    private static void swap(Comparable[] list, int x, int y) {
        final Comparable temp = list[x];
        list[x] = list[y];
        list[y] = temp;
    }
}
