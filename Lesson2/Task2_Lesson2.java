import java.util.Scanner;

public class Task2_Lesson2{
       public static void main(String ...args){
              Scanner scanner = new Scanner(System.in);
             
              System.out.println("Please provide item price: ");
              double price = scanner.nextDouble();
              
              
              System.out.println("Please, input customer age: ");
              int age = scanner.nextInt();
              
              double result=0;
              int computation_age = age<6 ? 1 : age > 6 && age< 18 ? 2 : 3;
                
              switch(computation_age){
              
                     case 1: 
                                   result = (price - price*0.8);
                                   System.out.printf("Discounted price is %.2f%n",result);
                                   break;
                                   
                     case 2:
                                   result = (price - price*0.25);
                                   System.out.printf("Discounted price is %.2f%n",result);
                                   break;
                     case 3 :
                                                                 
                                   result = (price - price*0.30);
                                   System.out.printf("Discounted price is %.2f%n",result);
                                   break;
                             
              }
              
       }
}