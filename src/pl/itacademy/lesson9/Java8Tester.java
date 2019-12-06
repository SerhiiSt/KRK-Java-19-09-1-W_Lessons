package pl.itacademy.lesson9;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Java8Tester {
    public static void main(String[] args) {
        Address toronto = new Address("Toronto");
        Address krakow = new Address("Krakow");
        Address kyiv = new Address("Kyiv");
        Address leon = new Address("Leon");
        Address warszawa = new Address("Warszawa");
        Address gdansk = new Address("Gdansk");

        List<Person> people = List.of(
                new Person("Michael", "Shumaher", LocalDate.of(1998, 11, 11), Sex.M, 20_000, toronto),
                new Person("Bob", "Shwarz", LocalDate.of(2001, 4, 3), Sex.M, 25_100, krakow),
                new Person("Milla", "Yollovich", LocalDate.of(2002, 6, 23), Sex.F, 4_100, krakow),
                new Person("Millena", "Kubik", LocalDate.of(2000, 7, 12), Sex.F, 3_200, krakow),
                new Person("Danylo", "Gal", LocalDate.of(1950, 2, 1), Sex.M, 23_600, kyiv),
                new Person("Zanna", "Dark", LocalDate.of(1900, 1, 1), Sex.F, 50_600, leon),
                new Person("Paul", "Bauman", LocalDate.of(1954, 2, 3), Sex.M, 16_200, warszawa),
                new Person("Marry", "Poppins", LocalDate.of(1967, 4, 12), Sex.F, 23_700, gdansk)
        );

        System.out.println("All men under 65 years : ");

        people.stream()
                .filter(person -> person.getBirthDay().isAfter(LocalDate.of(1954, 1, 1)) && person.getSex() == Sex.M)
                .map(Person::getFirstName)
                .forEach(System.out::println);

        System.out.println("---------------------------------");
        System.out.println("All women with salary less than 5000 : ");

        people.stream()
                .filter(person -> person.getSex() == Sex.F && person.getSalary() < 5_000)
                .map(Person::getBirthDay)
                .forEach(System.out::println);

        System.out.println("---------------------------------");
        System.out.println("All persons younger than 18 years from Krakow : ");

        people.stream()
                .filter(person -> person.getBirthDay().isAfter(LocalDate.of(2001, 1, 1)) && person.getAddress().equals(krakow))
                .map(Person::getFirstName)
                .forEach(System.out::println);


        System.out.println("---------------------------------");
        System.out.println("All persons who are not from Krakow : ");

        people.stream()
                .filter(person -> !(person.getAddress().equals(krakow)))
                .map(Person::getLastName)
                .forEach(System.out::println);

        System.out.println("---------------------------------");
        System.out.println("All persons who are not from Krakow  in reverse order: ");

        people.stream()
                .filter(person -> !(person.getAddress().equals(krakow)))
                .map(Person::getLastName)
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        System.out.println("---------------------------------");
        System.out.println("Average salary : ");

        people.stream()
                .mapToInt(Person::getSalary)
                .average()
                .ifPresent(avg -> System.out.println("The average salary is :" + avg));


        System.out.println("---------------------------------");
        System.out.println("Number of women in Krakow : ");

        System.out.println(people.stream()
                .filter(person -> person.getSex().equals(Sex.F) && person.getAddress().equals(krakow))
                .count());


        System.out.println("---------------------------------");
        System.out.println("Number of men after 65 years : ");

        System.out.println(people.stream()
                .filter(person -> person.getSex().equals(Sex.M) && person.getBirthDay().isAfter(LocalDate.of(1954, 1, 1)))
                .count());


        System.out.println("---------------------------------");
        System.out.println("Oldest person : ");

        System.out.println(people.stream()
                .map(Person::getBirthDay)
                .min(LocalDate::compareTo).get());

        System.out.println("---------------------------------");
        System.out.println("Youngest person from Krakow : ");

        System.out.println(people.stream()
                .filter(person -> person.getAddress().equals(krakow))
                .map(Person::getBirthDay)
                .max(LocalDate::compareTo).get());

        System.out.println("---------------------------------");
        System.out.println("Total salary : ");
        System.out.println(people.stream()
                .mapToInt(Person::getSalary)
                .sum());


    }
}
