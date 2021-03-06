package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!"stop".equals(resource)) {
            int quantity = Integer.parseInt(scanner.nextLine());

            Integer currentQuantity = resources.get(resource);
            if (currentQuantity == null) {
                currentQuantity = quantity;
            } else {
                currentQuantity += quantity;
            }
            resources.put(resource, currentQuantity);

            resource = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
