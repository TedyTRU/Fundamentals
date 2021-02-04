package FUNDAMENTALS.LAB14_METHODS;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());

        String repeatText = repeatString(text, repetitions);
        System.out.println(repeatText);

    }

    private static String repeatString(String text, int repetitions) {
        //String result = "";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repetitions; i++) {
            //result = result + text;
            result.append(text);
        }
        return result.toString();
    }
}
