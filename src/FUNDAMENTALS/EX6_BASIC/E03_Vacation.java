package FUNDAMENTALS.EX6_BASIC;

import java.util.Scanner;

public class E03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        if (type.equals("Students")) {
            switch (day) {
                case "Friday":
                    price = group * 8.45;
                    break;
                case "Saturday":
                    price = group * 9.80;
                    break;
                case "Sunday":
                    price = group * 10.46;
                    break;
            }
            if (group >= 30) {
                price *= 0.85;
            }

        } else if (type.equals("Business")) {
            if (group >= 100) {
                group -= 10;
            }

            switch (day) {
                case "Friday":
                    price = group * 10.90;
                    break;
                case "Saturday":
                    price = group * 15.60;
                    break;
                case "Sunday":
                    price = group * 16;
                    break;
            }

        } else if (type.equals("Regular")) {
            switch (day) {
                case "Friday":
                    price = group * 15;
                    break;
                case "Saturday":
                    price = group * 20;
                    break;
                case "Sunday":
                    price = group * 22.50;
                    break;
            }
            if (group >= 10 && group <= 20) {
                price *= 0.95;
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}
