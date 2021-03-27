package FUNDAMENTALS.FINAL_EXAM.II;

import java.util.*;
import java.util.stream.Collectors;

public class FE03_PlantDiscovery_2 {

    static class Plant {
        String name;
        int rarity;
        List<Double> ratings;

        public Plant(String name, int rarity) {
            this.name = name;
            this.rarity = rarity;
            this.ratings = new ArrayList<>();
        }

        public int getRarity() {
            return rarity;
        }

        public String getName() {
            return name;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public void addRating(double rating) {
            this.ratings.add(rating);
        }

        public void resetRating() {
            this.ratings.clear();
        }

        public double getAverageRating() {
            if (this.ratings.isEmpty()) {
                return 0.0;
            }
            double averageRating = 0;
            double sumOfRatings = this.ratings.stream().reduce((double) 0, Double::sum);
            averageRating = sumOfRatings / this.ratings.size();

            return averageRating;
        }


//        @Override
//        public String toString() {
//            return "- " + name + "; Rarity: " + rarity + "; Rating: " + ratings;
//        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Plant> plants = new HashMap();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] nameAndRarity = scanner.nextLine().split("<->");
            String plant = nameAndRarity[0];
            int rarity = Integer.parseInt(nameAndRarity[1]);

            Plant p = new Plant(plant, rarity);
            plants.put(p.getName(), p);

        }

        String command = scanner.nextLine();
        while (!"Exhibition".equals(command)) {
            String[] tokens = command.split(": ");
            String token = tokens[0];
            String name = tokens[1].split(" - ")[0];

            if (!plants.containsKey(name)) {
                System.out.println("error");

            } else {
                if (token.equals("Rate")) {
                    int rating = Integer.parseInt(tokens[1].split(" - ")[1]);
                    plants.get(name).addRating(rating);

                } else if (token.equals("Update")) {
                    int newRarity = Integer.parseInt(tokens[1].split(" - ")[1]);
                    //plants.get(name).rarity = newRarity;
                    plants.get(name).setRarity(newRarity);

                } else if (token.equals("Reset")) {
                    plants.get(name).resetRating();

                } else {
                    System.out.println("error");
                }
            }
            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        plants.values().stream()
                .sorted((s1, s2) -> {
                    if (s1.getRarity() != s2.getRarity()) {
                        return Integer.compare(s2.getRarity(), s1.getRarity());
                    } else {
                        return Double.compare(s2.getAverageRating(), s1.getAverageRating());
                    }
                })
                .map(p -> "- " + p.getName() + "; Rarity: " + p.getRarity() + "; Rating: " + String.format(Locale.US, "%.2f", p.getAverageRating()))
                .forEach(s -> System.out.println(s));

    }
}
