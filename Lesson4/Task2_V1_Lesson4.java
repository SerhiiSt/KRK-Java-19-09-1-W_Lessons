
public class Task2_V1_Lesson4 {
    public static void main(String[] args) {

        int[] numbers = {5, 8, 34, 2, 1, 4, 90, 45};

        int max = numbers[0];
        int min = numbers[0];


        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }


        System.out.println("Max number is : " + max);
        System.out.println("Min number is : " + min);


    }
}