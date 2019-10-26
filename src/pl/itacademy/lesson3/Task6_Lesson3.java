package pl.itacademy.lesson3;

public class Task6_Lesson3 {

    public static void main(String[] args) {

        int maxNumber = 100;
        String primeNumberFound = "";

        for (int i = 2; i <= maxNumber; i++) {

            if (isPrimeNumber(i)) {

                primeNumberFound = primeNumberFound + i + "  ";

            }

        }

        System.out.println("Prime numbers from 2 to " + maxNumber + " are ");
        System.out.println(primeNumberFound);
    }

    private static boolean isPrimeNumber(int numberToCheck) {


        for (int index = 2; index < numberToCheck / 2; index++) {

            if (numberToCheck % index == 0) {
                return false;
            }
        }
        return true;
    }
}    