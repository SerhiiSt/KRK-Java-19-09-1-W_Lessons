package pl.itcacademy.lesson2;

public class Task5_Lesson2 {


    public static void main(String... args) {

        int index = args.length - 1;
        if (args.length == 0) System.out.println("No arguments");
        while (index >= 0) {
            System.out.println(args[index]);
            index--;


        }

    }

}