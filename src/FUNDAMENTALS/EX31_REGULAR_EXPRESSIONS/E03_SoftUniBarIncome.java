package FUNDAMENTALS.EX31_REGULAR_EXPRESSIONS;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+.?\\d+)\\$";
        Pattern pattern = Pattern.compile(regex);
        String line = scanner.nextLine();
        double totalIncome = 0;

        while (!"end of shift".equals(line)) {
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = price * count;
                totalIncome += totalPrice;

                System.out.printf("%s: %s - %.2f%n", name, product, totalPrice);
            }

            line = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalIncome);

    }
}
