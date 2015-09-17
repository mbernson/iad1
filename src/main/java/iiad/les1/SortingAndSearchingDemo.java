package iiad.les1;

import iiad.les1.searching.LinearSearch;
import iiad.les1.searching.Searchable;
import iiad.les1.sorting.BubbleSort;
import iiad.les1.sorting.Sortable;

public class SortingAndSearchingDemo {

    public static void main(String[] args) {
        final Character[] rij = {'M', 'H', 'O', 'G', 'P', 'F', 'Z', 'D', 'A', 'K'};

        Sortable<Character> sort = new BubbleSort<>();
        Searchable<Character> search = new LinearSearch<>();

        final long start, end;
        start = System.currentTimeMillis();
        int index = search.search(rij, 'A');
        System.out.printf("Karakter A staat op index %d\n", index);
        final Character[] sorted = sort.sort(rij);
        end = System.currentTimeMillis();

        System.out.println("Done");
        printList(sorted);
        System.out.printf("Elapsed time: %d ms\n", (end - start));
    }

    private static void printList(Character[] list) {
        for(Character c : list) {
            System.out.println(c);
        }
    }
}
