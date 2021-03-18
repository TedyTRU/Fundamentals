package FUNDAMENTALS.FINAL_EXAM.V;

import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class FE03_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<Integer>> cities = new TreeMap<>();

        while (!"Sail".equals(line)) {
            String[] lineOfCities = line.trim().split("\\|+");
            String city = lineOfCities[0];
            int population = Integer.parseInt(lineOfCities[1]);
            int gold = Integer.parseInt(lineOfCities[2]);

            if (!cities.containsKey(city)) {
                cities.put(city, Arrays.asList(0, 0));
            }

            population += cities.get(city).get(0);
            gold += cities.get(city).get(1);

            cities.get(city).set(0, population);
            cities.get(city).set(1, gold);

            line = scanner.nextLine();
        }

        line = scanner.nextLine();

        while (!"End".equals(line)) {
            String command = line.split("=>")[0];

            if ("Plunder".equals(command)) {
                String town = line.split("=>")[1];
                int people = Integer.parseInt(line.split("=>")[2]);
                int gold = Integer.parseInt(line.trim().split("=>")[3]);

                if (cities.containsKey(town)) {
                    int population = cities.get(town).get(0);
                    int currentGold = cities.get(town).get(1);

                    population -= people;
                    currentGold -= gold;

                    cities.get(town).set(0, population);
                    cities.get(town).set(1, currentGold);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);

                    if (population <= 0 || currentGold <= 0) {
                        System.out.printf("%s has been wiped off the map!%n", town);
                        cities.remove(town);

                    }
                }

            } else if ("Prosper".equals(command)) {
                String town = line.split("=>")[1];
                int gold = Integer.parseInt(line.split("=>")[2]);

                if (gold < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else if (gold > 0) {
                    int currentGold = cities.get(town).get(1) + gold;
                    cities.get(town).set(1, currentGold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, currentGold);
                }
            }

            line = scanner.nextLine();
        }

        if (cities.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size());

            cities.entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().get(1).compareTo(e1.getValue().get(1)))
                    .forEach(entry -> {
                        int population = entry.getValue().get(0);
                        int gold = entry.getValue().get(1);

                        System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), population, gold);
                    });
        }

    }
}
