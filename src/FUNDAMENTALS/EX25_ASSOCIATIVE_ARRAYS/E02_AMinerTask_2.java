package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E02_AMinerTask_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!"stop".equals(resource)) {
            int quantity = Integer.parseInt(scanner.nextLine());

            resources.putIfAbsent(resource, 0);
            int newQuantity = resources.get(resource) + quantity;

            resources.put(resource, newQuantity);

            resource = scanner.nextLine();
        }

        resources.forEach((k, v) -> System.out.printf("%s -> %d%n", k, v));

    }
}
