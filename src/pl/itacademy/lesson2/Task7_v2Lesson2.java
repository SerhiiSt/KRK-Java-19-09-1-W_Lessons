package pl.itacademy.lesson2;

import java.util.Scanner;

public class Task7_v2Lesson2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide your number: ");

        int number = scanner.nextInt();

        if (isPrimeNumber(number)) {
            System.out.println("The number " + number + " is prime number");
        } else {
            System.out.println("The number " + number + " is not prime number");
        }

    }

    private static boolean isPrimeNumber(int number) {

        int count = 2;

        if (number <= 1) {
            return false;
        }


        while (count < Math.sqrt(number)) {
            if (number % count == 0) {
                return false;
            }
            count++;
        }
        return true;

    }

}
