package pl.itcacademy.lesson2;

import java.util.Scanner;

public class Task7_Lesson2{
      public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide your number: ");

        int number = scanner.nextInt();

        if (isPrimeNumber(number)) {
            System.out.println("The number " + number + " is prime number");
        } else {
            System.out.println("The number " + number + " is not prime number");
        }

    }

    private static boolean isPrimeNumber(int number){

        if(number<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;

    }

}
