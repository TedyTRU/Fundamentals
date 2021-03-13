package FUNDAMENTALS.EX28_TEXT_PROCESSING;

import java.util.Scanner;

public class E07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        StringBuilder afterExplosions = new StringBuilder(line);
        int strength = 0;

        for (int i = 0; i < afterExplosions.length(); i++) {

            if (strength > 0 && afterExplosions.charAt(i) != '>') {
                afterExplosions.deleteCharAt(i);
                i--;
                strength--;
                continue;
            }

            if (afterExplosions.charAt(i) == '>') {
                strength += Integer.parseInt(String.valueOf(afterExplosions.charAt(i + 1)));
            }

        }

        System.out.println(afterExplosions.toString());
    }
}
