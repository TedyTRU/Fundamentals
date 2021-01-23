package FUNDAMENTALS.EX09_DATA_TYPES_AND_VARIABLES;

import java.util.Scanner;

public class E07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int tankCapacity = 255;
        int pouredWater = 0;

        for (int i = 0; i < numberOfLines; i++) {
            int litersOfWater = Integer.parseInt(scanner.nextLine());

            if (litersOfWater > tankCapacity) {
                System.out.println("Insufficient capacity!");
            } else {
                tankCapacity -= litersOfWater;
                pouredWater += litersOfWater;
            }

        }
        System.out.println(pouredWater);
    }
}
