package pl.itacademy.lesson3;//1. Using do..while loop printout numbers from 10 to 0.

import java.util.Arrays;

public class Task1_Lesson3 {

    public static void main(String... args) {

        int[] array = new int[10];
        int index = 0;
        int count = 10;

        do {

            array[index] = count;
            index++;
            count--;


        }
        while (index < 10);


        System.out.println(Arrays.toString(array));
    }

}