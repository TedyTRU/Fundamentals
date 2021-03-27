package FUNDAMENTALS.FINAL_EXAM.II;

import java.util.*;

public class FE03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> plants = new HashMap<>();

        for (int i = 0; i < numberOfLines; i++) {
            String[] plantInformation = scanner.nextLine().split("<->");
            String plant = plantInformation[0];
            int rarity = Integer.parseInt(plantInformation[1]);

            if (!plants.containsKey(plant)) {
                plants.put(plant, Arrays.asList(0.0, 0.0));
            }
            double currentRarity = plants.get(plant).get(0) + rarity;
            plants.get(plant).set(0, currentRarity);
        }

        String commands = scanner.nextLine();
        while (!"Exhibition".equals(commands)) {
            String command = commands.split(":")[0];
            String plant = commands.split(":")[1].split(" - ")[0].trim();

            if (!plants.containsKey(plant)) {
                System.out.println("error");

            } else {
                if ("Rate".equals(command)) {
                    double rating = Double.parseDouble(commands.split(":")[1].split(" - ")[1]);

                    if (plants.get(plant).get(1) == 0) {
                        plants.get(plant).set(1, rating);
                    } else {
                        double currentRating = (plants.get(plant).get(1) + rating) / 2;
                        plants.get(plant).set(1, currentRating);
                    }

                } else if ("Update".equals(command)) {
                    double rarity = Double.parseDouble(commands.split(":")[1].split(" - ")[1]);
                    plants.get(plant).set(0, rarity);

                } else if ("Reset".equals(command)) {
                    plants.get(plant).set(1, 0.0);

                } else {
                    System.out.println("error");
                }
            }
            commands = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");

        plants.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().get(1).compareTo(e1.getValue().get(1)))
                .sorted((n1, n2) -> n2.getValue().get(0).compareTo(n1.getValue().get(0)))
                .forEach(plant -> System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n", plant.getKey(), plant.getValue().get(0), plant.getValue().get(1)));
    }
}
