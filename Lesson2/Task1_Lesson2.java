import java.util.Scanner;

public class Task1_Lesson2{
       public static void main(String ...args){
              Scanner scanner = new Scanner(System.in);
             
              System.out.println("Please provide item price: ");
              double price = scanner.nextDouble();
              
              
              System.out.println("Please, input customer age: ");
              int age = scanner.nextInt();
              
              double result=0;
               
              
              if(age < 6){
                 result = (price - price*0.8);
                 System.out.printf("Discounted price is %.2f%n",result);   
              }
              else if (age > 6 && age< 18){
                 result = (price - price*0.25);
                 System.out.printf("Discounted price is %.2f%n",result);   
              }
              else{
                 result = (price - price*0.30);
                 System.out.printf("Discounted price is %.2f%n",result);
              }
              
              
              
       }
}