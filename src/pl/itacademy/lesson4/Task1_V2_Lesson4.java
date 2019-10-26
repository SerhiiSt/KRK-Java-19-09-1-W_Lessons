package pl.itacademy.lesson4;

import java.util.Arrays;


public class Task1_V2_Lesson4 {

    public static void main(String[] args) {

        int[] numbers = {7, 20, 5, -2, 13, 3};

        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(numbers));
    }
}
