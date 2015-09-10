package iad1;

import iad1.sorting.Quicksort;
import iad1.sorting.Sorter;

class Main {
    public static void main(String[] args) {
        System.out.print("\nstarting\n\n");

        final Integer[] items = {3, 4, 2, 1, 5};

        final Sorter<Integer> sorter = new Quicksort<>();

        final Integer[] sorted = sorter.sort(items);

        printArray(sorted);

        System.out.print("\ndone\n");
    }

    private static void printArray(final Integer[] sorted) {
        System.out.print("[");
        for (int i = 0; i < sorted.length; i++) {
            if(i < sorted.length - 1) {
                System.out.printf("%d, ", sorted[i]);
            } else {
                System.out.print(sorted[i]);
            }
        }
        System.out.print("]\n");
    }

}

