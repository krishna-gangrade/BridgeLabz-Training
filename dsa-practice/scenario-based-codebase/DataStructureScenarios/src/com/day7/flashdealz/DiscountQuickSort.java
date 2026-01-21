
package com.day7.flashdealz;

public class DiscountQuickSort {

    public static void sortByDiscount(DealProduct[] items, int start, int end) {
        if (start < end) {
            int pivotIndex = arrange(items, start, end);
            sortByDiscount(items, start, pivotIndex - 1);
            sortByDiscount(items, pivotIndex + 1, end);
        }
    }

    private static int arrange(DealProduct[] items, int start, int end) {
        double pivotDiscount = items[end].getDiscount();
        int position = start;

        for (int i = start; i < end; i++) {
            if (items[i].getDiscount() > pivotDiscount) {
                swap(items, i, position);
                position++;
            }
        }
        swap(items, position, end);
        return position;
    }

    private static void swap(DealProduct[] items, int i, int j) {
        DealProduct temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }
}
