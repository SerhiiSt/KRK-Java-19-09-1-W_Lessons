package pl.itacademy.lesson8;

import java.util.function.Function;

public class LambdaTester2 {
    public static void main(String[] args) {
        System.out.println(modifyString("reedrf", (String::length)));
        System.out.println(modifyString("reedrf", (String s) -> s.length()));

    }

    public static Integer modifyString(String text, Function<String, Integer> function) {
        return function.apply(text);
    }
}
