import java.util.Arrays;
public class Test2{
public static void main(String ... arg){

  int[][] two = new int[2][2];
  two[0][0]= 2;
  two[0][1]= 2;
  
  System.out.println(Arrays.toString(two[0]));
  System.out.println(Arrays.toString(two[1]));
  
  System.out.println(two[0].length);
  
  
  int index =0;
  while(index<arg.length){
  System.out.println(arg[index]);
  index++;
  }
  


}
}