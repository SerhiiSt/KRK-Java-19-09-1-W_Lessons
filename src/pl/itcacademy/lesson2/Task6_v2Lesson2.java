package pl.itcacademy.lesson2;

public class Task6_v2Lesson2{

        public static void main(String ... args) {

        double sum =0;

        int count =0;

       while(count<args.length){
            sum+=Double.parseDouble(args[count]);
            count++;
        }
        System.out.println("The sum is :" + sum);


    }
}    