package pl.itacademy.lesson4;

import java.util.Arrays;

public class SelectSorting {

    public static void sort(int array[]) {

        int len = array.length;

        for (int i = 0; i < len - 1; i++) {

            int minElement = i;

            for (int j = i + 1; j < len; j++) {
                if (array[j] < array[minElement]) {
                    int temp = array[j];
                    array[j] = array[minElement];
                    array[minElement] = temp;
                }
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("Array before sorting");
        int[] array = {7, 2, 9, 0, 4, 0, 2, -5, 2};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println("Array after sorting");
        System.out.println(Arrays.toString(array));

    }
}
