package FUNDAMENTALS.EX09_DATA_TYPES_AND_VARIABLES;

import java.util.Scanner;

public class E08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double biggestVolume = 0;
        String biggestKeg = "";

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > biggestVolume) {
                biggestKeg = model;
                biggestVolume = volume;
            }
        }
        System.out.println(biggestKeg);
    }
}
