package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E03_LegendaryFarming_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        Map<String, Integer> junk = new TreeMap<>();

        while (true) {
            int quantity = Integer.parseInt(scanner.next());
            String name = scanner.next();
            name = name.toLowerCase();

            if (keyMaterials.containsKey(name)) {
                keyMaterials.put(name, keyMaterials.get(name) + quantity);

                if (keyMaterials.get(name) >= 250) {
                    keyMaterials.put(name, keyMaterials.get(name) - 250);
                    String legendaryItem = "";
                    if (name.equals("shards")) legendaryItem = "Shadowmourne";
                    else if (name.equals("fragments")) legendaryItem = "Valanyr";
                    else legendaryItem = "Dragonwrath";
                    System.out.println(legendaryItem + " obtained!");
                    break;
                }

            } else {
                if (!junk.containsKey(name)) junk.put(name, 0);
                junk.put(name, junk.get(name) + quantity);
            }
        }

        keyMaterials.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .forEach(product -> {
                    System.out.println(product.getKey() + ": " + product.getValue());
                });
        junk.entrySet().stream()
                .forEach(product -> {
                    System.out.println(product.getKey() + ": " + product.getValue());
                });
    }
}