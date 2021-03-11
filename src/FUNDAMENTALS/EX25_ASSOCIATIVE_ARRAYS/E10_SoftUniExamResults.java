package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, Integer> contest = new TreeMap<>();
        Map<String, Integer> submissions = new TreeMap<>();

        while (!"exam finished".equals(line)) {
            String name = line.split("-")[0];
            String language = line.split("-")[1];

            if (!language.equals("banned")) {
                int points = Integer.parseInt(line.split("-")[2]);

                if (!contest.containsKey(name)) {
                    contest.put(name, points);
                } else {
                    int currentPoints = contest.get(name);
                    int maxPoints = Math.max(currentPoints, points);
                    contest.put(name, maxPoints);
                }

                Integer count = submissions.get(language);
                if (count == null) {
                    count = 0;
                }
                submissions.put(language, count + 1);


            } else {
                contest.remove(name);
            }

            line = scanner.nextLine();
        }

        System.out.println("Results:");
        contest.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach((entry) -> System.out.printf("%s | %d%n", entry.getKey(), entry.getValue()));

        System.out.println("Submissions:");
        submissions.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach((entry) -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));

    }
}
