package pl.itacademy.lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3_V2_Lesson1 {

       public static void main(String... args) throws Exception {

              InputStreamReader inputStreamReader = new InputStreamReader(System.in);
              BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
              System.out.println("Please, input your name.");
              String name = bufferedReader.readLine();
              System.out.println("Nice to meet you, " + name + "!");

       }
}