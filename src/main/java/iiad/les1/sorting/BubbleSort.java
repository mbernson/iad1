package iiad.les1.sorting;

public class BubbleSort<T extends Comparable<T>> implements Sortable<T> {

    @Override
    public T[] sort(T[] list) {
        int end = list.length;

        boolean swapped;
        do {
            swapped = false;

            for(int i = 1; i < end; i++) {

                if(list[i-1].compareTo(list[i]) > 0) {
                    final T temp = list[i-1];
                    list[i-1] = list[i];
                    list[i] = temp;
                    swapped = true;
                }

            }

            end--;

        } while(swapped);

        return list;
    }

}
