package pl.itacademy.lesson8;

import java.util.function.Function;

/**
 * Created by Sergio on 11/29/19.
 */
public class LambdaTester {
    public static void main(String[] args) {
        System.out.println(modifyString("text", String::toUpperCase));
        System.out.println(modifyString("text", String::toLowerCase));
        System.out.println(modifyString("text", (String s) -> s.substring(0, 1)));
        System.out.println(modifyString("Hello", (String s) -> s.substring(s.length() - 1)));
    }

    public static String modifyString(String text, Function<String, String> function) {
        return function.apply(text);
    }

}
