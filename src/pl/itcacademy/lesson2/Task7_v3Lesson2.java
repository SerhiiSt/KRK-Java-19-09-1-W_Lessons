package pl.itcacademy.lesson2;

import java.math.BigInteger;
import java.util.stream.Stream;


public class Task7_v3Lesson2{

    public static void main(String... args) {

        Stream.iterate(new BigInteger("2"), BigInteger::nextProbablePrime)
                .limit(25)
                .forEach(x -> System.out.printf("%s\t", x));


    }
}    