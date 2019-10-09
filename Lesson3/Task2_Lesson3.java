//2. Using for with counter loop print out all application arguments.
import java.util.Arrays;

  public class Task2_Lesson3{
         public static void main (String ...args){
              
              
             if(args.length ==0){ System.out.println("No arguments to print");} 
             
             for(int i=0;i<args.length;i++){
                 System.out.println(args[i]);
             
             }   
         
         }
  }