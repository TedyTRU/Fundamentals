package FUNDAMENTALS.EX31_REGULAR_EXPRESSIONS;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E05_NetherRealms_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] listOfDemons = scanner.nextLine().split(",+0*\\s*");
        Map<String, double[]> demons = new TreeMap<>();

        String healthRegex = "([^0-9-+*./])";
        String damageRegex = "([-]?[0-9]*[.]?[0-9]+)";
        Pattern healthPattern = Pattern.compile(healthRegex);
        Pattern damagePattern = Pattern.compile(damageRegex);

        for (int i = 0; i < listOfDemons.length; i++) {
            String demon = listOfDemons[i].trim();

            double health = 0;
            double damage = 0;

            Matcher healthMatcher = healthPattern.matcher(demon);
            Matcher damageMatcher = damagePattern.matcher(demon);

            while (healthMatcher.find()) {
                health += healthMatcher.group(1).charAt(0);
            }

            while (damageMatcher.find()) {
                double number = Double.parseDouble(damageMatcher.group(1));
                damage += number;
            }

            int multiplier = demon.replaceAll("[^*]", "").length();
            int divisor = demon.replaceAll("[^/]", "").length();
            int n = Math.abs(multiplier - divisor);

            for (int j = 0; j < n; j++) {
                if (multiplier > divisor) {
                    damage *= 2;
                } else if (divisor > multiplier) {
                    damage /= 2;
                }
            }
            demons.put(demon, new double[]{health, damage});
        }

        demons.entrySet().forEach(demon -> System.out.printf("%s - %.0f health, %.2f damage%n", demon.getKey(), demon.getValue()[0], demon.getValue()[1]));

    }
}
