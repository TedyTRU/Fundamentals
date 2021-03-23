package FUNDAMENTALS.EX31_REGULAR_EXPRESSIONS;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E06_ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(?<=\\s)[a-zA-Z0-9]+[.\\-_]?[A-Za-z0-9]+@[A-Za-z]+\\-?[A-Za-z]+\\.[A-Za-z]+(\\.[A-Za-z]+)?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {

            System.out.println(matcher.group());

        }

    }
}
