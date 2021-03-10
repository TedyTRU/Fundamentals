package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS;

import java.util.*;

public class E09_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<String>> forceSides = new TreeMap<>();

        while (!"Lumpawaroo".equals(line)) {

            if (line.contains("|")) {
                String[] input = line.split(" \\| ");
                String side = input[0];
                String user = input[1];

                registeredForceUser(forceSides, side, user);

            } else if (line.contains("->")) {
                String[] input = line.split(" -> ");
                String user = input[0];
                String side = input[1];
                String checkSide = "";

                for (Map.Entry<String, List<String>> entry : forceSides.entrySet()) {
                    if (entry.getValue().contains(user)) {
                        checkSide = entry.getKey();
                    }
                }

                if (!checkSide.equals(side)) {
                    if (!checkSide.equals("")) {
                        forceSides.get(checkSide).remove(user);
                    }

                    registeredForceUser(forceSides, side, user);
                    System.out.printf("%s joins the %s side!%n", user, side);
                }
            }

            line = scanner.nextLine();
        }

        forceSides.entrySet().stream()
                .filter((e) -> e.getValue().size() > 0)
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach((entry) -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());

                    entry.getValue()
                            .stream()
                            .sorted((s1, s2) -> s1.compareTo(s2))
                            .forEach(user -> System.out.printf("! %s%n", user));

                });

    }

    private static void registeredForceUser(Map<String, List<String>> forceSides, String side, String user) {
        if (!forceSides.containsKey(side)) {
            forceSides.put(side, new ArrayList<>());
        }

        boolean containsUser = false;
        for (Map.Entry<String, List<String>> entry : forceSides.entrySet()) {
            if (entry.getValue().contains(user)) {
                containsUser = true;
                break;
            }
        }
        if (!containsUser) {
            forceSides.get(side).add(user);
        }
    }
}
