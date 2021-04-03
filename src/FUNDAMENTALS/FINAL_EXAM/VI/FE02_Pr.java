package FUNDAMENTALS.FINAL_EXAM.VI;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FE02_Pr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "(U\\$)(?<username>[A-Z][a-z]{2,})\\1(P@\\$)(?<password>[a-z]{5,}[0-9]+)\\3";
        Pattern pattern = Pattern.compile(regex);
        int count = 0;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s%n", matcher.group("username"), matcher.group("password"));
                count++;
            } else {
                System.out.println("Invalid username or password");
            }

        }
        System.out.printf("Successful registrations: %d%n", count);
    }
}
