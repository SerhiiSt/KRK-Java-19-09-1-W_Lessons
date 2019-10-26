package pl.itacademy.lesson3;

public class Task3_Lesson3 {

    public static void main(String... args) {

        if (args.length == 0) {
            System.out.println("No arguments");
        }

        for (String value : args) {
            System.out.println(value);
        }
    }

}