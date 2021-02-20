package FUNDAMENTALS.EX21_OBJECTS_AND_CLASSES;

import FUNDAMENTALS.EX21_OBJECTS_AND_CLASSES.E03_OpinionPoll.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03_OpinionPoll_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String personalData = scanner.nextLine();
            String name = personalData.split("\\s+")[0];
            int age = Integer.parseInt(personalData.split("\\s+")[1]);

                Person persons = new Person(name, age);
                people.add(persons);

        }

        people.stream().filter(p -> p.getAge() > 30).collect(Collectors.toList());

        //people.sort(Comparator.comparing(e -> e.getName()));
        people.sort(Comparator.comparing(Person::getName));

        for (Person person : people) {
            System.out.println(person);
        }

    }
}
