package iad1;

class Main {
    public static void main(String[] args) {
        System.out.print("\nstarting\n\n");

        final int[] items = {3, 4, 2, 1, 5};

        final int[] sorted = quicksort(items);

        printArray(sorted);

        System.out.print("\ndone\n");
    }

    private static void printArray(int[] sorted) {
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

    public static int[] quicksort(int[] input) {
        return input;
    }
}

