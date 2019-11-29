package pl.itacademy.lesson7;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sergio on 11/27/19.
 */
public class CountOfLetters {

    public Map<Character, Integer> countOfLetters(String text) {

        Map<Character, Integer> mapOfChars = new HashMap<>();
        char[] charArray = text.toCharArray();


        for (char c : charArray) {
            if (Character.isLetter(c)) {
                if (mapOfChars.containsKey(c)) {
                    mapOfChars.put(c, mapOfChars.get(c) + 1);
                } else {
                    mapOfChars.put(c, 1);
                }
            }
        }
        return mapOfChars;

    }
}

