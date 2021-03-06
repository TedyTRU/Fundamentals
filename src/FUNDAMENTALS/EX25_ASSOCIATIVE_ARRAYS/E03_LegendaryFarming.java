package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E03_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        Map<String, Integer> keyMat = new TreeMap<>();
        keyMat.put("shards", 0);
        keyMat.put("fragments", 0);
        keyMat.put("motes", 0);
        Map<String, Integer> junk = new TreeMap<>();
        boolean isObtained = false;

        while (!isObtained) {
            for (int i = 0; i < line.length; i += 2) {
                int quantity = Integer.parseInt(line[i]);
                String material = line[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = keyMat.get(material) + quantity;
                    keyMat.put(material, currentQuantity);
                    if (currentQuantity >= 250) {
                        switch (material) {
                            case "shards":
                                System.out.println("Shadowmourne obtained!");
                                break;
                            case "fragments":
                                System.out.println("Valanyr obtained!");
                                break;
                            case "motes":
                                System.out.println("Dragonwrath obtained!");
                                break;
                        }
                        keyMat.put(material, currentQuantity - 250);
                        isObtained = true;
                    }

                } else {
                    junk.putIfAbsent(material, 0);
                    int currentQuantity = junk.get(material) + quantity;
                    junk.put(material, currentQuantity);
                }
                if (isObtained) {
                    break;
                }
            }
            line = scanner.nextLine().split(" ");
        }

        keyMat.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach((entry) -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
        junk.forEach((k, v) -> System.out.printf("%s: %d%n", k, v));

    }
}
