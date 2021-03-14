package FUNDAMENTALS.EX28_TEXT_PROCESSING;

import javax.print.DocFlavor;
import java.util.Scanner;

public class E08_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        double finalSum = 0;

        for (String word : line) {

            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);
            String number = word.substring(1, word.length() - 1);
            double num = Double.parseDouble(number);
            double sum = 0;

            if (Character.isUpperCase(firstLetter)) {
                sum += (num / (firstLetter - 64));
            } else if (Character.isLowerCase(firstLetter)) {
                sum += (num * (firstLetter - 96));
            }

            if (Character.isUpperCase(lastLetter)) {
                sum -= (lastLetter - 64);
            } else if (Character.isLowerCase(lastLetter)) {
                sum += (lastLetter - 96);
            }
            finalSum += sum;
        }

        System.out.printf("%.2f", finalSum);

    }
}
