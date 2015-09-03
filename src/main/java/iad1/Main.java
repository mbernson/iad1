package iad1;

import iad1.sorting.Quicksort;

class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Integer[] items = {3, 4, 2, 1, 5};

        Quicksort<Integer> sorter = new Quicksort<>(items);
        Integer[] sorted = sorter.sort();
    }
}

