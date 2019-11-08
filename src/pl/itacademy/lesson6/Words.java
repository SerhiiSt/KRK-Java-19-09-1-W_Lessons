package pl.itacademy.lesson6;


import java.util.ArrayList;
import java.util.List;

public class Words {

    private static void checkTheLengthOfWords(String words) {

        String[] listOfWords = words.split(" ");

        String shortWord = listOfWords[0];
        String longWord = listOfWords[0];

        List<String> listOfShortWords = new ArrayList<>();
        List<String> listOfLongWords = new ArrayList<>();

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
                listOfShortWords.add(text);
            } else if (text.length() == longWord.length()) {
                listOfLongWords.add(text);
            }

        }

        System.out.println("List of short words " + listOfShortWords);
        System.out.println("List of long words " + listOfLongWords);
    }

    public static void main(String[] args) {
        String text = "For given text find the longest and the shortest words";
        checkTheLengthOfWords(text);

    }

}
