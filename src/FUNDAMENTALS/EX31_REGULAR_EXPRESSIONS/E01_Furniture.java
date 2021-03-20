package FUNDAMENTALS.EX31_REGULAR_EXPRESSIONS;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lines = scanner.nextLine();
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)\\b";
        Pattern pattern = Pattern.compile(regex);
        List<String> listOfFurniture = new ArrayList<>();
        double finalPrice = 0.0;


        while (!"Purchase".equals(lines)) {
            Matcher matcher = pattern.matcher(lines);

            if (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                double totalPrice = price * quantity;
                finalPrice += totalPrice;

                listOfFurniture.add(furniture);

            }

            lines = scanner.nextLine();
        }

        System.out.println("Bought furniture:");

        //System.out.println(String.join("\n", listOfFurniture));
        listOfFurniture.forEach(e -> System.out.println(e));

        System.out.printf("Total money spend: %.2f", finalPrice);

    }
}
