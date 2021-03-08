package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E07_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (students.containsKey(name)) {
                grade = (grade + students.get(name)) / 2;
            }

            students.put(name, grade);
        }

        students.entrySet().stream()
                .filter((e) -> e.getValue() >= 4.50)
                .sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue()))
                .forEach(student -> System.out.printf("%s -> %.2f%n", student.getKey(), student.getValue()));

    }
}
