package pl.itacademy.lesson4;

public class Task2_V2_Lesson4 {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 9, 15, 3, -2};

        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
            if (min > number) {
                min = number;
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
