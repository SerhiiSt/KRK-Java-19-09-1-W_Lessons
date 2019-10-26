package pl.itacademy.lesson4;

import java.util.Arrays;


public class Task1_V1_Lesson4 {

    public static void main(String[] args) {

        int[] numbers = {7, 20, 5, -2, 13, 3};

        boolean isSorted;
        int i = 0;

        do {
            isSorted = true;

            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j - 1] < numbers[j]) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                    isSorted = false;
                }
            }
            i++;


        } while (!isSorted);
        System.out.println(Arrays.toString(numbers));
    }

}
