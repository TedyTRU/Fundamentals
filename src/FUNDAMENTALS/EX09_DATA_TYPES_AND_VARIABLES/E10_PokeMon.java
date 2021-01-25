package FUNDAMENTALS.EX09_DATA_TYPES_AND_VARIABLES;

import java.util.Scanner;

public class E10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustedFactor = Integer.parseInt(scanner.nextLine());
        double percentage = (double) pokePower / 2;

        int count = 0;

        while (pokePower >= distance) {
            pokePower -= distance;
            count++;

            if (pokePower == percentage) {
                if (exhaustedFactor > 0) {
                    pokePower /= exhaustedFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(count);
    }
}
