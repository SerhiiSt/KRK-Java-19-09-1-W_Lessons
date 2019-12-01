package pl.itacademy.lesson8;

import java.util.function.Function;

public class LambdaTester3 {

    public static void main(String[] args) {
        Integer count = modifyString("Hello guys from California", LambdaTester3::apply);
        System.out.println(count);
    }

    public static Integer modifyString(String text, Function<String, Integer> function) {
        return function.apply(text);
    }

    private static Integer apply(String s) {
        return s.split("\\s+").length;
    }
}


