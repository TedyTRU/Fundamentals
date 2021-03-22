package FUNDAMENTALS.EX31_REGULAR_EXPRESSIONS;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class E04_StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "@(?<planet>[A-Za-z]+)[^-@!:>]*:(?<population>\\d+)[^-@!:>]*!(?<attackType>[AD])![^-@!:>]*->(?<soldiers>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanet = new ArrayList<>();
        List<String> destroyedPlaned = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine();
            int count = countTheLetters(message);
            String encryptedMessage = encryptMessage(message, count);
            Matcher matcher = pattern.matcher(encryptedMessage);

            if (matcher.find()) {
                String planet = matcher.group("planet");
                String type = matcher.group("attackType");

                if (type.equals("A")) {
                    if (!attackedPlanet.contains(planet)) {
                        attackedPlanet.add(planet);
                    }
                } else if (type.equals("D")) {
                    if (!destroyedPlaned.contains(planet)) {
                        destroyedPlaned.add(planet);
                    }
                }
            }
        }

        System.out.printf("Attacked planets: %d%n", attackedPlanet.size());
        attackedPlanet.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList())
                .forEach(planet -> System.out.println("-> " + planet));

        System.out.printf("Destroyed planets: %d%n", destroyedPlaned.size());
        destroyedPlaned.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(planet -> System.out.println("-> " + planet));

    }

    private static String encryptMessage(String message, int count) {
        StringBuilder encryptedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char symbol = (char) (message.charAt(i) - count);
            encryptedMessage.append(symbol);
        }
        return encryptedMessage.toString();
    }

    private static int countTheLetters(String message) {
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == 's' ||
                    message.charAt(i) == 't' ||
                    message.charAt(i) == 'a' ||
                    message.charAt(i) == 'r' ||
                    message.charAt(i) == 'S' ||
                    message.charAt(i) == 'T' ||
                    message.charAt(i) == 'A' ||
                    message.charAt(i) == 'R') {
                count++;
            }
        }
        return count;
    }
}
