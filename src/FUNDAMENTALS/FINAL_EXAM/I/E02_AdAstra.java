package FUNDAMENTALS.FINAL_EXAM.I;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "([|#]){1}(?<item>[A-Za-z ]+)\\1(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})\\1(?<cal>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> food = new ArrayList<>();  //Don't use a map, there can be duplicate items
        int sumOfCalories = 0;

        while (matcher.find()) {
            String date = matcher.group("date");
            String item = matcher.group("item");
            int calories = Integer.parseInt(matcher.group("cal"));

            sumOfCalories += calories;
            food.add(String.format("Item: %s, Best before: %s, Nutrition: %d", item, date, calories));
        }
        int days = sumOfCalories / 2000;

        System.out.printf("You have food to last you for: %d days!%n", days);
        for (String item : food) {
            System.out.println(item);
        }
    }
}
