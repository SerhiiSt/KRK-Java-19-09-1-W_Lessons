package pl.itacademy.lesson8;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Sergio on 11/27/19.
 */
public class UniqueLetters {

    public static Set<Character> uniqueChars(String text) {

        Set<Character> setOfChars = new TreeSet<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') setOfChars.add(text.charAt(i));
        }
        return setOfChars;

    }

}
