package pl.itacademy.lesson3;

public class Task2_Lesson3 {

    public static void main(String... args) {


        if (args.length == 0) {
            System.out.println("No arguments to print");
        }

        for (String arg : args) {
            System.out.println(arg);

        }

    }
}