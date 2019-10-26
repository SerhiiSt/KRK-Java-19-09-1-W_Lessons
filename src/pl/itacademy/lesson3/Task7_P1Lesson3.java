package pl.itacademy.lesson3;

public class Task7_P1Lesson3 {

    public static void main(String[] args) {

        String text = "";
        for (String arg : args) {
            text = arg;
        }
        char[] charArray = text.toCharArray();

        for (char character : charArray) {
            System.out.println(character);
        }
    }
}

   