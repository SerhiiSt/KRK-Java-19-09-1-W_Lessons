package pl.itcacademy.lesson2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6_Lesson2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        System.out.println("Please provide your numbers: ");

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = scanner.nextLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        for (String aList : list) {
            sum += Double.parseDouble(aList);
        }

        System.out.println("Your sum is : " + sum);

    }
}
