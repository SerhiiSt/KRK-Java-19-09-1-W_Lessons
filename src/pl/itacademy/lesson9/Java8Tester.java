package pl.itacademy.lesson9;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Java8Tester {
    public static void main(String[] args) {
        Address toronto = new Address("Toronto");
        Address krakow = new Address("Krakow");
        Address kyiv = new Address("Kyiv");
        Address leon = new Address("Leon");
        Address warszawa = new Address("Warszawa");
        Address gdansk = new Address("Gdansk");

        List<Person> people = List.of(
                new Person("Michael", "Shumaher", LocalDate.of(1998, 11, 11), Sex.MALE, 20_000, toronto),
                new Person("Bob", "Shwarz", LocalDate.of(2001, 4, 3), Sex.MALE, 25_100, krakow),
                new Person("Milla", "Yollovich", LocalDate.of(2002, 6, 23), Sex.FEMALE, 4_100, krakow),
                new Person("Millena", "Kubik", LocalDate.of(2000, 7, 12), Sex.FEMALE, 3_200, krakow),
                new Person("Danylo", "Gal", LocalDate.of(1950, 2, 1), Sex.MALE, 23_600, kyiv),
                new Person("Zanna", "Dark", LocalDate.of(1900, 1, 1), Sex.FEMALE, 50_600, leon),
                new Person("Paul", "Bauman", LocalDate.of(1954, 2, 3), Sex.MALE, 16_200, warszawa),
                new Person("Marry", "Poppins", LocalDate.of(1967, 4, 12), Sex.FEMALE, 23_700, gdansk),
                new Person("Aaron", "Doberg", LocalDate.of(2006, 3, 3), Sex.MALE, 23_700, gdansk)
        );


        System.out.println("All men under 65 years : ");

        people.stream()
                .filter(person -> person.getAge() < 65)
                .filter(person -> person.getSex() == Sex.MALE)
                .map(Person::getFirstName)
                .forEach(System.out::println);

        System.out.println("---------------------------------");
        System.out.println("All women with salary less than 5000 : ");

        people.stream()
                .filter(person -> person.getSex() == Sex.FEMALE)
                .filter(person -> person.getSalary() < 5_000)
                .map(Person::getFirstName)
                .forEach(System.out::println);

        System.out.println("---------------------------------");
        System.out.println("All persons younger than 18 years from Krakow : ");

        people.stream()
                .filter(person -> person.getAge() < 18)
                .filter(person -> person.getAddress().equals(krakow))
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
                .ifPresent(avg -> System.out.printf("The average salary is : %.2f%n", avg));


        System.out.println("---------------------------------");
        System.out.println("Number of women in Krakow : ");

        System.out.println(people.stream()
                .filter(person -> person.getSex().equals(Sex.FEMALE))
                .filter(person -> person.getAddress().equals(krakow))
                .count());


        System.out.println("---------------------------------");
        System.out.println("Number of men after 65 years : ");

        System.out.println(people.stream()
                .filter(person -> person.getSex().equals(Sex.MALE))
                .filter(person -> person.getAge() > 65)
                .count());


        System.out.println("---------------------------------");
        System.out.println("Oldest person : ");

        System.out.println(people.stream()
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFirstName));


        System.out.println("---------------------------------");
        System.out.println("Youngest person from Krakow : ");

        System.out.println(people.stream()
                .filter(person -> person.getAddress().equals(krakow))
                .min(Comparator.comparing(Person::getAge))
                .map(Person::getFirstName));


        System.out.println("---------------------------------");
        System.out.println("Total salary : ");
        System.out.println(people.stream()
                .mapToInt(Person::getSalary)
                .sum());


        System.out.println("---------------------------------");
        System.out.println("Does any person has first letter 'A' in firstName : ");
        boolean answer = people.stream()
                .anyMatch(person -> person.getFirstName().startsWith("A"));
        System.out.println(answer);

        System.out.println("---------------------------------");
        System.out.println("Does all persons contains letter 'a' in lastName : ");
        boolean output = people.stream()
                .allMatch(person -> person.getLastName().contains("a"));
        System.out.println(output);


        Person michael = new Person("Michael", "Shumaher", LocalDate.of(1998, 11, 11), Sex.MALE, 20_000, toronto);
        Person dava = new Person("David", "Cukermann", LocalDate.of(1967, 2, 5), Sex.MALE, 21_000, krakow);
        Person lana = new Person("Lana", "Bormann", null, Sex.FEMALE, 22_000, krakow);


        Optional<String> names = Optional.of(getPersonName(lana));
        System.out.println(names);

    }

    public static String getPersonName(Person person) {

        final Optional<LocalDate> date = Optional.ofNullable(person.getBirthDay());
        if (date.isPresent()) {
            return person.getFirstName().substring(0, 1) + person.getLastName() + person.getBirthDay();
        } else {
            return person.getFirstName().substring(0, 1) + person.getLastName() + LocalDate.now();

        }
    }

}
