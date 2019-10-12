import java.util.Scanner;

public class Task2_Lesson2{
       Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide item price: ");
        double price = scanner.nextDouble();


        System.out.println("Please, input customer age: ");
        int age = scanner.nextInt();

        double discount = 0;
        int computation_age = age < 6 ? 1 : age > 6 && age < 18 ? 2 : 3;

        switch (computation_age) {

            case 1:
                discount = price * 0.8;
                break;

            case 2:
                discount = price * 0.25;
                break;
            case 3:

                discount = price * 0.30;
                break;

        }
        System.out.printf("Discounted price is %.2f%n", price - discount);
    }
}