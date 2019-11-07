package pl.itacademy.lesson6;


public class Words {

    private static void checkTheLengthOfWords(String words) {

        String[] listOfWords = words.split(" ");

        String shortWord = listOfWords[0];
        String longWord = listOfWords[0];

        for (String text : listOfWords) {
            if (shortWord.length() > text.length()) {
                shortWord = text;
            }
            if (longWord.length() < text.length()) {
                longWord = text;
            }

        }

        for (String text : listOfWords) {
            if (text.length() == shortWord.length()) {
                System.out.println(text);
            } else if (text.length() == longWord.length()) {
                System.out.println(text);
            }

        }
    }

    public static void main(String[] args) {
        String text = "For given text find the longest and the shortest words";
        checkTheLengthOfWords(text);

    }

}
