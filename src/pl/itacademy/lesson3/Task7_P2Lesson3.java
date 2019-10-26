package pl.itacademy.lesson3;

public class Task7_P2Lesson3 {

    public static void main(String[] args) {

        String text = "";
        for (String arg : args) {
            text = arg;
        }

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }


    }
}
