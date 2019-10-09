//3. Using enhanced for loop (for-each loop) print out all application arguments.

   public class Task3_Lesson3{
          public static void main(String ...args){
          
           if(args.length == 0){System.out.println("No arguments");}
           
                 for(String value : args){
                     System.out.println(value);
                 }
          }
   
   }