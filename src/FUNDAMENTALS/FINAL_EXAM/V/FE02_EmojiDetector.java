package FUNDAMENTALS.FINAL_EXAM.V;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FE02_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String digitRegex = "\\d";
        Pattern digitPattern = Pattern.compile(digitRegex);
        Matcher digitMatcher = digitPattern.matcher(text);
        long threshold = 1;

        while (digitMatcher.find()) {
            threshold *= Integer.parseInt(digitMatcher.group());
        }

        //String emojiRegex = "([:*]{2})(?<letters>[A-Z][a-z]{2,})\\1";
        String emojiRegex = "([:]{2}|[*]{2})(?<letters>[A-Z][a-z]{2,})\\1";
        Pattern emojiPattern = Pattern.compile(emojiRegex);
        Matcher emojiMatcher = emojiPattern.matcher(text);
        Map<String, Integer> emojis = new LinkedHashMap<>();

        while (emojiMatcher.find()) {

            int coolness = 0;
            for (int i = 0; i < emojiMatcher.group("letters").length(); i++) {
                coolness += emojiMatcher.group("letters").charAt(i);
            }

            emojis.put(emojiMatcher.group(), coolness);
        }

        System.out.println("Cool threshold: " + threshold);
        System.out.println(emojis.size() + " emojis found in the text. The cool ones are:");

        long finalThreshold = threshold;
        emojis.entrySet().stream()
                .filter(e -> e.getValue() > finalThreshold)
                .forEach(emoji -> System.out.println(emoji.getKey()));

    }
}
