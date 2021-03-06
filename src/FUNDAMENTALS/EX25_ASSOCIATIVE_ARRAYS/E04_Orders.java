package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E04_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while (!"buy".equals(line)) {
            String[] command = line.split(" ");
            String product = command[0];
            double price = Double.parseDouble(command[1]);
            int quantity = Integer.parseInt(command[2]);

            if (!productQuantity.containsKey(product)) {
                productPrice.put(product, price);
                productQuantity.put(product, quantity);

            } else {
                int newQuantity = productQuantity.get(product) + quantity;
                productQuantity.put(product, newQuantity);
                productPrice.put(product, price);
            }

            line = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productPrice.entrySet()) {
            String nameOfProduct = entry.getKey();
            double totalPrice = entry.getValue() * productQuantity.get(nameOfProduct);
            System.out.printf("%s -> %.2f%n", nameOfProduct, totalPrice);
        }

    }
}
