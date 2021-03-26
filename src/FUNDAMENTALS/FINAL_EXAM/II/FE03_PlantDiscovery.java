package FUNDAMENTALS.FINAL_EXAM.II;

import java.util.*;

public class FE03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> plants = new HashMap<>();
        Map<String, List<Double>> plantsRating = new HashMap<>();

        for (int i = 0; i < numberOfLines; i++) {
            String[] plantInformation = scanner.nextLine().split("<->");
            String plant = plantInformation[0];
            int rarity = Integer.parseInt(plantInformation[1]);

            if (!plantsRating.containsKey(plant)) {
                plantsRating.put(plant, new ArrayList<>());
            }
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

            if ("Rate".equals(command)) {
                double rating = Double.parseDouble(commands.split(":")[1].split(" - ")[1]);

                plantsRating.get(plant).add(rating);

            } else if ("Update".equals(command)) {
                double rarity = Double.parseDouble(commands.split(":")[1].split(" - ")[1]);

                plants.get(plant).set(0, rarity);

            } else if ("Reset".equals(command)) {

                plantsRating.get(plant).clear();
                //plants.get(plant).set(1, 0.0);

            } else {
                System.out.println("error");
            }

            commands = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        plants.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().get(1).compareTo(e1.getValue().get(1)))
                .sorted((n1, n2) -> n2.getValue().get(0).compareTo(n1.getValue().get(0)))
                .forEach(plant -> System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n", plant.getKey(), plant.getValue().get(0),
                        plantsRating.get(plant.getKey())
                                .stream().mapToDouble(Double::doubleValue)
                                .average().orElse(0.0)));
    }
}
