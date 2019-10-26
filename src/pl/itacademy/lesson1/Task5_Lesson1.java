package pl.itacademy.lesson1;

public class Task5_Lesson1 {

       public static void main(String... arg) {

              double a = 4.0;
              double c = 1.0;

              int b = 1;
              int d = 3;
              int e = 5;
              int f = 7;
              int g = 9;
              int k = 11;


              double result = a * (b - (c / d) + (c / e) - (c / f) + (c / g) - (c / k));

              System.out.println("Result of computation is : " + result);

       }

}