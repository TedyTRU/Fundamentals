package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS_ADD;

import java.util.*;

public class E02_Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lines = scanner.nextLine();
        Map<String, TreeMap<String, Integer>> contests = new LinkedHashMap<>();

        while (!"no more time".equals(lines)) {
            String name = lines.split(" -> ")[0];
            String contest = lines.split(" -> ")[1];
            int points = Integer.parseInt(lines.split(" -> ")[2]);

            TreeMap<String, Integer> users = new TreeMap<>();
            users.put(name, points);

            if (!contests.containsKey(contest)) {
                contests.put(contest, users);

            } else {
                if (!contests.get(contest).containsKey(name)) {
                    contests.get(contest).put(name, points);
                } else {
                    contests.get(contest).put(name, (Math.max(points, contests.get(contest).get(name))));
                }
            }

            lines = scanner.nextLine();
        }

        int[] num = new int[1];

        contests.entrySet().stream()
                .forEach(e -> {
                    num[0] = 0;
                    System.out.printf("%s: %d participants%n", e.getKey(), e.getValue().size());
                    e.getValue().entrySet().stream()
                            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                            .forEach(entry ->
                                    System.out.printf("%d. %s <::> %d%n",++num[0], entry.getKey(), entry.getValue()));
                });

        System.out.println("Individual standings:");

        Map<String, Integer> individualStanding = new TreeMap<>();

        for (Map.Entry<String, TreeMap<String, Integer>> entry : contests.entrySet()) {
            for (Map.Entry<String, Integer> userName : entry.getValue().entrySet()) {
                String name = userName.getKey();
                int currentPoints = userName.getValue();
                Integer points = individualStanding.get(name);
                if (points == null) {
                    points = 0;
                }
                individualStanding.put(name, points + currentPoints);
            }
        }
        num[0] = 0;
        individualStanding.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.printf("%d. %s -> %d%n",++num[0], e.getKey(), e.getValue()));

    }
}