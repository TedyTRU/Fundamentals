package FUNDAMENTALS.EX21_OBJECTS_AND_CLASSES.E03_OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String personalData = scanner.nextLine();
            String name = personalData.split("\\s+")[0];
            int age = Integer.parseInt(personalData.split(" ")[1]);

            if (age > 30) {
                Person persons = new Person(name, age);
                people.add(persons);
            }

        }

        //people.sort(Comparator.comparing(e -> e.getName()));
        people.sort(Comparator.comparing(Person::getName));
        //people.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));

        for (Person person : people) {
            System.out.println(person);
        }

    }
}
