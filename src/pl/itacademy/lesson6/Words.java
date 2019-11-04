package pl.itacademy.lesson6;


public class Words {

    public void checkTheLengthOfWords(String words) {

        String[] text = words.split(" ");
        String longWord = text[0];
        String shortestWord = text[0];
        String listOfLongestWords = "";
        String listOfShortestWords = "";

        for (int i = 0; i < text.length; i++) {

            if (text[i].length() > longWord.length()) {
                listOfLongestWords = listOfLongestWords + " " + text[i];
                longWord = text[i];

            }
        }

        for (int i = 0; i < text.length; i++) {
            if (text[i].length() <= shortestWord.length()) {
                listOfShortestWords = listOfShortestWords + " " + text[i];
                shortestWord = text[i];

            }
        }

        System.out.println("List of longest words is " + "[" + listOfLongestWords + "]");
        System.out.println("List of shortest words is " + "[" + listOfShortestWords + "]");

    }
}
