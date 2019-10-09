 public class Task5_Lesson2{
            public static void main(String ... args){
            
                   int count =0;
                   int argsIndex = args.length-1;
                   if(args.length==0) System.out.println("No arguments");
                   while(count<args.length){
                         System.out.println(args[argsIndex]);
                         argsIndex--;
                         count++;
                   }
                   
            }
            
     }