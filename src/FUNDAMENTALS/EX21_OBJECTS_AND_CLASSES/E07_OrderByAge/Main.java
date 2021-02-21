package FUNDAMENTALS.EX21_OBJECTS_AND_CLASSES.E07_OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> people = new ArrayList<>();

        while (!"End".equals(input)) {
            String name = input.split("\\s+")[0];
            String ID = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);

            Person person = new Person(name, ID, age);
            people.add(person);

            input = scanner.nextLine();
        }

        people.sort(Comparator.comparing(Person::getAge));
        for (Person person : people) {
            System.out.println(person);
        }

    }
}
