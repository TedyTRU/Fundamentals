package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS_ADD;

import java.util.*;

public class E01_Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contests = new HashMap<>();
        Map<String, HashMap<String, Integer>> users = new TreeMap<>();

        String lines = scanner.nextLine();
        while (!"end of contests".equals(lines)) {
            String contest = lines.split(":")[0];
            String password = lines.split(":")[1];

            contests.put(contest, password);

            lines = scanner.nextLine();
        }
        String submissions = scanner.nextLine();
        while (!"end of submissions".equals(submissions)) {
            String contest = submissions.split("=>")[0];
            String password = submissions.split("=>")[1];
            String name = submissions.split("=>")[2];
            int points = Integer.parseInt(submissions.split("=>")[3]);

            if (contests.containsKey(contest) && contests.get(contest).equals(password)) {
                HashMap<String, Integer> course = new HashMap<>();
                course.put(contest, points);

                if (!users.containsKey(name)) {
                    users.put(name, course);
                } else {
                    if (!users.get(name).containsKey(contest)) {
                        users.get(name).put(contest, points);
                    } else {
                        users.get(name).put(contest, (Math.max(points, users.get(name).get(contest))));
                    }
                }
            }
            submissions = scanner.nextLine();
        }

        int totalSum = 0;
        String winner = "";
        for (Map.Entry<String, HashMap<String, Integer>> entry : users.entrySet()) {
            int sum = entry.getValue().values().stream().mapToInt(i -> i).sum();
            if (sum > totalSum) {
                totalSum = sum;
                winner = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", winner, totalSum);
        System.out.println("Ranking: ");

        users.entrySet()
                .forEach((user) -> {
                    System.out.println(user.getKey());
                    user.getValue().entrySet().stream()
                            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                            .forEach(e ->
                                    System.out.printf("#  %s -> %d%n", e.getKey(), e.getValue()));
                });
    }
}
