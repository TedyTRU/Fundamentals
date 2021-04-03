package FUNDAMENTALS.FINAL_EXAM.VI;

import java.util.*;

public class FE03_Pr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<Integer>> people = new TreeMap<>();

        while (!"Results".equals(command)) {
            String[] commands = command.split(":");
            String token = commands[0];
            String name = commands[1];

            if (token.equals("Add")) {
                int health = Integer.parseInt(commands[2]);
                int energy = Integer.parseInt(commands[3]);

                if (!people.containsKey(name)) {
                    people.put(name, Arrays.asList(health, energy));
                } else {
                    int currentHealth = people.get(name).get(0) + health;
                    people.get(name).set(0, currentHealth);
                }

            } else if (token.equals("Attack")) {
                String defenderName = commands[2];
                int damage = Integer.parseInt(commands[3]);

                if (people.containsKey(name) && people.containsKey(defenderName)) {

                    int currentHealth = people.get(defenderName).get(0) - damage;
                    if (currentHealth <= 0) {
                        people.remove(defenderName);
                        System.out.printf("%s was disqualified!%n", defenderName);
                    } else {
                        people.get(defenderName).set(0, currentHealth);
                    }

                    int currentEnergy = people.get(name).get(1) - 1;
                    if (currentEnergy <= 0) {
                        people.remove(name);
                        System.out.printf("%s was disqualified!%n", name);
                    } else {
                        people.get(name).set(1, currentEnergy);
                    }
                }

            } else if (token.equals("Delete")) {

                if (name.equals("All")) {
                    people.clear();
                } else {
                    people.remove(name);
                }

            }

            command = scanner.nextLine();
        }

        System.out.printf("People count: %d%n", people.size());

        people.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().get(0).compareTo(e1.getValue().get(0)))
                .forEach(entry -> System.out.printf("%s - %d - %d%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));


    }
}
