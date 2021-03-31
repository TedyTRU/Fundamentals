package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS_ADD;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E03_MOBA_Challenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lines = scanner.nextLine();
        Map<String, TreeMap<String, Integer>> playerPool = new TreeMap();

        while (!"Season end".equals(lines)) {
            if (lines.contains(" -> ")) {
                String player = lines.split(" -> ")[0];
                String position = lines.split(" -> ")[1];
                int skill = Integer.parseInt(lines.split(" -> ")[2]);

                TreeMap<String, Integer> positions = new TreeMap<>();
                positions.put(position, skill);

                if (!playerPool.containsKey(player)) {
                    playerPool.put(player, positions);
                } else {
                    if (!playerPool.get(player).containsKey(position)) {
                        playerPool.get(player).put(position, skill);
                    } else {
                        playerPool.get(player).put(position, (Math.max(skill, playerPool.get(player).get(position))));
                    }
                }
            } else if (lines.contains("vs")) {
                String firstPlayer = lines.split(" vs ")[0];
                String secondPlayer = lines.split(" vs ")[1];
                boolean hasInCommon = false;

                if (playerPool.containsKey(firstPlayer) && playerPool.containsKey(secondPlayer)) {
                    for (Map.Entry<String, Integer> firstEntry : playerPool.get(firstPlayer).entrySet()) {
                        for (Map.Entry<String, Integer> secondEntry : playerPool.get(secondPlayer).entrySet()) {
                            if (secondEntry.getKey().equals(firstEntry.getKey())) {
                                hasInCommon = true;
                                break;
                            }
                        }
                    }
                }
                if (hasInCommon) {

                    if (playerPool.get(firstPlayer).values().stream().mapToInt(i -> i).sum() >
                            playerPool.get(secondPlayer).values().stream().mapToInt(i -> i).sum()) {
                        playerPool.remove(secondPlayer);

                    } else if (playerPool.get(firstPlayer).values().stream().mapToInt(i -> i).sum() <
                            playerPool.get(secondPlayer).values().stream().mapToInt(i -> i).sum()) {
                        playerPool.remove(firstPlayer);
                    }
                }
            }

            lines = scanner.nextLine();
        }

        playerPool.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().values().stream().mapToInt(i -> i).sum(),
                        e1.getValue().values().stream().mapToInt(i -> i).sum()))
                .forEach(entry -> {
                    System.out.printf("%s: %d skill%n", entry.getKey(), entry.getValue().values().stream().mapToInt(i -> i).sum());
                    entry.getValue().entrySet().stream()
                            .sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue()))
                            .forEach(player ->
                                    System.out.printf("- %s <::> %d%n", player.getKey(), player.getValue()));
                });

    }
}
