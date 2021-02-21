package FUNDAMENTALS.EX21_OBJECTS_AND_CLASSES.E05_Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);

            Student student = new Student(name, lastName, grade);
            students.add(student);

        }

        List<Student> sortedList = students.stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList());

        for (Student student : sortedList) {
            System.out.println(student.toString());
        }

    }
}

