package iiad.les1;

import java.util.Random;

public class RandomSorting {

    public static void main(String[] args) {
        final int[] randomElements = generateRandomCharArray(1000);
        System.out.println("Generated a random list");
        printList(randomElements);
        System.out.println("Sorting...");


        final long start, end;
        start = System.currentTimeMillis();
        final int[] sorted = bubblesort(randomElements);
        end = System.currentTimeMillis();

        System.out.println("Done");
        printList(sorted);
        System.out.printf("Elapsed time: %d ms\n", (end - start));
    }

    private static int[] generateRandomCharArray(int amount) {
        Random rng = new Random();
        int[] result = new int[amount];
        for (int i = 0; i < amount; i++) {
            result[i] = rng.nextInt();
        }
        return result;
    }

    public static int[] bubblesort(int[] list) {
        int end = list.length;

        boolean swapped;
        do {
            swapped = false;

            for(int i = 1; i < end; i++) {

                if(list[i-1] > list[i]) {
                    final int temp = list[i-1];
                    list[i-1] = list[i];
                    list[i] = temp;
                    swapped = true;
                }

            }

            end--;

        } while(swapped);

        return list;
    }

    private static void printList(int[] list) {
        System.out.print("{ ");
        for(Integer c : list) {
            System.out.print(c);
            System.out.print(", ");
        }
        System.out.print("}\n");
    }
}
