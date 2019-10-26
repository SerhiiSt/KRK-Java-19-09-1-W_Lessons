package pl.itcacademy.lesson2;

import java.util.Arrays;

public class Task3_Lesson2 {

    public static void main(String... args) {

        int count = 0;
        int[] array = new int[10];
        while (count < 10) {
            array[count] = count + 1;
            count++;
        }

        System.out.println(Arrays.toString(array));

    }


}