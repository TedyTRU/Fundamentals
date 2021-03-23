package FUNDAMENTALS.EX31_REGULAR_EXPRESSIONS;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E05_NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lineOfDemons = scanner.nextLine().split(",+0*\\s*");
        Map<String, List<Double>> bookOfDemons = new TreeMap<>();
        
        for (int i = 0; i < lineOfDemons.length; i++) {
            String demon = lineOfDemons[i].trim();

            double health = givesHealth(demon);
            double damage = givesDamage(demon);
            List<Double> demonsContains = Arrays.asList(health, damage);

            if (!bookOfDemons.containsKey(demon)) {
                bookOfDemons.put(demon, demonsContains);
            }
        }

        bookOfDemons.forEach((key, value) -> System.out.printf("%s - %.0f health, %.2f damage%n", key, value.get(0), value.get(1)));

    }

    private static double givesDamage(String demon) {
        String regex = "([-])?([0-9]*[.]?[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(demon);
        double damage = 0;

        while (matcher.find()) {
            double number = Double.parseDouble(matcher.group(2));
            if (matcher.group(1) == null) {
                damage += number;
            } else {
                damage -= number;
            }
        }

        String multiplicationAndDivisionRegex = "([*\\/])";
        Pattern multiplicationAndDivisionPattern = Pattern.compile(multiplicationAndDivisionRegex);
        Matcher multiplicationAndDivisionMatcher = multiplicationAndDivisionPattern.matcher(demon);

        while (multiplicationAndDivisionMatcher.find()) {
            if (multiplicationAndDivisionMatcher.group(1).equals("*")) {
                damage *= 2;
            } else if (multiplicationAndDivisionMatcher.group(1).equals("/")) {
                damage /= 2;
            }
        }

        return damage;
    }

    private static int givesHealth(String demon) {
        String regex = "([^0-9-+*./])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(demon);
        int health = 0;

        while (matcher.find()) {
            health += matcher.group(1).charAt(0);
        }
        return health;
    }
}
