package pl.itacademy.lesson2;

public class Task4_Lesson2 {

    public static void main(String... args) {

        int index = 0;
        if (args.length == 0) System.out.println("No arguments");
        while (index < args.length) {
            System.out.println(args[index]);
            index++;
        }

    }

}