package pl.itcacademy.lesson2;

public class Task7_v4Lesson2{

    public static void main(String[] args) {

        int maxNumber = 100;
        String primeNumberFound = "";
        int i = 2;
        while (i <= maxNumber) {

            if (isPrimeNumber(i)) {

                primeNumberFound = primeNumberFound + i + "  ";

            }
            i++;
        }

        System.out.println("Prime numbers from 2 to " + maxNumber + " are ");
        System.out.println(primeNumberFound);
    }

    private static boolean isPrimeNumber(int numberToCheck) {

        int index = 2;
        int reminder;
        while (index < numberToCheck / 2) {
            reminder = numberToCheck % index;
            index++;
            if (reminder == 0) {
                return false;
            }
        }
        return true;
    }
}