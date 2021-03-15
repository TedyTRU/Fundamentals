package FUNDAMENTALS.EX28_TEXT_PROCESSING_ADD;

import java.util.Scanner;

public class E01_ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            int startNameIndex = line.indexOf('@') + 1;
            int endNameIndex = line.indexOf('|');
            String name = line.substring(startNameIndex, endNameIndex);

            int startAgeIndex = line.indexOf('#') + 1;
            int endAgeIndex = line.indexOf('*');
            String age = line.substring(startAgeIndex, endAgeIndex);

            System.out.printf("%s is %s years old.%n", name, age);
        }

    }
}
