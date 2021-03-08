package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS;

import java.util.*;

public class E06_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!"end".equals(line)) {
            String course = line.split(" : ")[0];
            String name = line.split(" : ")[1];

            if (!courses.containsKey(course)) {
                courses.put(course, new ArrayList<>());
            }
            courses.get(course).add(name);

            line = scanner.nextLine();
        }

        courses.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach((entry) -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(student -> System.out.printf("-- %s%n", student));
                });

//        courses
//                .entrySet()
//                .stream()
//                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
//                .forEach(entry -> {
//                    System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue().size()));
//                    entry.getValue()
//                            .stream()
//                            .sorted((s1, s2) -> s1.compareTo(s2))
//                            .forEach(s -> System.out.println(String.format("-- %s", s)));
//                });

    }
}
