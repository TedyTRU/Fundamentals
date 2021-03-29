package FUNDAMENTALS.FINAL_EXAM.IV;

import java.util.*;

public class FE03_HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroes = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] hero = scanner.nextLine().split("\\s+");
            String name = hero[0];
            int HP = Integer.parseInt(hero[1]);
            int MP = Integer.parseInt(hero[2]);

            if (!heroes.containsKey(name)) {
                heroes.put(name, Arrays.asList(HP, MP));
            }
        }

        String commands = scanner.nextLine();
        while (!"End".equals(commands)) {
            String command = commands.split(" - ")[0];
            String name = commands.split(" - ")[1];
            int HP = heroes.get(name).get(0);
            int MP = heroes.get(name).get(1);

            if (heroes.containsKey(name)) {

                if (command.equals("CastSpell")) {
                    int neededMP = Integer.parseInt(commands.split(" - ")[2]);
                    String spellName = commands.split(" - ")[3];

                    if (neededMP <= MP) {
                        MP -= neededMP;
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", name, spellName, MP);
                        heroes.get(name).set(1, MP);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", name, spellName);
                    }

                } else if (command.equals("TakeDamage")) {
                    int damage = Integer.parseInt(commands.split(" - ")[2]);
                    String attacker = commands.split(" - ")[3];

                    HP -= damage;
                    if (HP > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", name, damage, attacker, HP);
                        heroes.get(name).set(0, HP);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", name, attacker);
                        heroes.remove(name);
                    }

                } else if (command.equals("Recharge")) {
                    int amount = Integer.parseInt(commands.split(" - ")[2]);

                    if ((MP + amount) > 200) {
                        amount = 200 - MP;
                    }
                    heroes.get(name).set(1, MP + amount);
                    System.out.printf("%s recharged for %d MP!%n", name, amount);

                } else if (command.equals("Heal")) {
                    int amount = Integer.parseInt(commands.split(" - ")[2]);

                    if (HP + amount > 100) {
                        amount = 100 - HP;
                    }
                    heroes.get(name).set(0, HP + amount);
                    System.out.printf("%s healed for %d HP!%n", name, amount);
                }
            }

            commands = scanner.nextLine();
        }
        heroes.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().get(0).compareTo(e1.getValue().get(0)))
                .forEach(entry -> System.out.printf("%s%n HP: %d%n MP: %d%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
