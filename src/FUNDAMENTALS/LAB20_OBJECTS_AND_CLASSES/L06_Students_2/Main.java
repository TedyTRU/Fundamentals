package FUNDAMENTALS.LAB20_OBJECTS_AND_CLASSES.L06_Students_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!"end".equals(line)) {
            String[] input = line.split(" ");
            String name = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            String town = input[3];

            if (!IsStudentExisting(students, name, lastName)) {
                Student student = new Student(name, lastName, age, town);
                students.add(student);
            } else {
                Student existingStudent = getStudent(students, name, lastName);
                existingStudent.setAge(age);
                existingStudent.setCity(town);
            }

            line = scanner.nextLine();
        }

        String filterCity = scanner.nextLine();
        for (Student student : students) {
            if (student.getCity().equals(filterCity)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getSecondName(), student.getAge());
            }
        }

    }

    private static boolean IsStudentExisting(List<Student> list, String firstName, String secondName) {
        for (Student student : list) {
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> list, String firstName, String secondName) {
        Student existingStudent = null;

        for (Student student : list) {
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

}
