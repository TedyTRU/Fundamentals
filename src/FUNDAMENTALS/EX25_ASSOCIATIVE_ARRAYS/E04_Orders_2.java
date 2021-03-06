package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E04_Orders_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while (!"buy".equals(line)) {
            String product = line.split(" ")[0];
            double price = Double.parseDouble(line.split(" ")[1]);
            int quantity = Integer.parseInt(line.split(" ")[2]);

            productPrice.put(product, price);

            Integer newQuantity = productQuantity.get(product);
            if (newQuantity == null) {
                newQuantity = 0;
            }
            newQuantity += quantity;
            productQuantity.put(product, newQuantity);

            line = scanner.nextLine();
        }
        productPrice.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, (v * productQuantity.get(k))));
    }
}
