import java.util.Scanner;

public class Task1_Lesson2{
       public static void main(String ...args){
       
             Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide item price: ");
        double price = scanner.nextDouble();


        System.out.println("Please, input customer age: ");
        int age = scanner.nextInt();

        double discount;

        if (age < 6) {
            discount = price * 0.8;

        } else if (age > 6 && age < 18) {
            discount = price * 0.25;

        } else {
            discount = price * 0.30;
        }

        System.out.printf("Discounted price is %.2f%n", price - discount);
              
              
       }
}