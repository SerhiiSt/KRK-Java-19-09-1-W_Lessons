  import java.util.Scanner;
  
  public class Task4_Lesson1{
  
     public static void main(String ...args){
        
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input number1: ");
            int number1 = scanner.nextInt();
            System.out.println("Please input number2: ");
            int number2 = scanner.nextInt();
            int result = number1*number2;
            System.out.println("The result of multiplication : " + result);
             
     }
  }