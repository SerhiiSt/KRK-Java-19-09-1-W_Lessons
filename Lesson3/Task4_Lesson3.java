//4. Calculate average value for array of numbers. For iterating over array use enhanced for loop.

  public class Task4_Lesson3{
         public static void main(String ...args){
                
                double[] array = {-1,4,5,6,5,30,5,-6,7.9,4.3};
                double sum =0;
                double average;
                
                for(Double number : array){
                    sum+=number;
                    
                } 
                
                average = sum/array.length; 
                System.out.println(average); 
                
                              
         }
  }

