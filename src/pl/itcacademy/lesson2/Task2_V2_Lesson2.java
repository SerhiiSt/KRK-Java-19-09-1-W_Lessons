package pl.itcacademy.lesson2;

import java.util.Scanner;

public class Task2_V2_Lesson2 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide your color: ");
        String color = scanner.nextLine();


        switch (color) {

            case "green":

                System.out.println("You can go!");
                break;

            case "yellow":

                System.out.println("Prepare to go");
                break;


            default:
                System.out.println("Please, stop!");


        }

    }
}