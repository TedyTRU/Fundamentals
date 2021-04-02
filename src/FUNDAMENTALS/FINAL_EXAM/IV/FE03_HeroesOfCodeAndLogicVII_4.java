package FUNDAMENTALS.FINAL_EXAM.IV;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FE03_HeroesOfCodeAndLogicVII_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, int[]> heroes = new LinkedHashMap<>();
        int numberOfHeroes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfHeroes; i++) {
            String[] heroInfo = scanner.nextLine().split("\\s+");
            heroes.put(heroInfo[0], new int[2]);
            heroes.get(heroInfo[0])[0] += Integer.parseInt(heroInfo[1]);
            heroes.get(heroInfo[0])[1] += Integer.parseInt(heroInfo[2]);
        }
        String command;
        while (!"End".equals(command = scanner.nextLine())) {
            String[] type = command.split(" - ");
            String name = type[1];
            int number = Integer.parseInt(type[2]);
            switch (type[0]) {
                case "CastSpell":
                    if (heroes.get(name)[1] - number >= 0) {
                        heroes.get(name)[1] -= number;
                        System.out.println(name + " has successfully cast " + type[3] + " and now has " + heroes.get(name)[1] + " MP!");
                    } else {
                        System.out.println(name + " does not have enough MP to cast " + type[3] + "!");
                    }
                    break;
                case "TakeDamage":
                    heroes.get(name)[0] -= number;
                    if (heroes.get(name)[0] > 0) {
                        System.out.println(name + " was hit for " + number + " HP by " + type[3] + " and now has " + heroes.get(name)[0] + " HP left!");
                    } else {
                        System.out.println(name + " has been killed by " + type[3] + "!");
                        heroes.remove(name);
                    }
                    break;
                case "Recharge":
                    int before = heroes.get(name)[1];
                    if (before + number > 200) {
                        heroes.get(name)[1] = 200;
                        number = 200 - before;
                    } else {
                        heroes.get(name)[1] += number;
                    }
                    System.out.println(name + " recharged for " + number + " MP!");
                    break;
                case "Heal":
                    int blood = heroes.get(name)[0];
                    if (blood + number > 100) {
                        heroes.get(name)[0] = 100;
                        number = 100 - blood;
                    } else {
                        heroes.get(name)[0] += number;
                    }
                    System.out.println(name + " healed for " + number + " HP!");
                    break;
            }
        }
        heroes.entrySet().stream().sorted((a, b) -> {
            int result = Integer.compare(b.getValue()[0], a.getValue()[0]);
            if (result == 0) {
                result = a.getKey().compareTo(b.getKey());
            }
            return result;
        }).forEach(e -> System.out.printf("%s%n  HP: %d%n  MP: %d%n",
                e.getKey(), e.getValue()[0], e.getValue()[1]));

    }
}
