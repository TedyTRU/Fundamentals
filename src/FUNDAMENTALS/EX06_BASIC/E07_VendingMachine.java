package FUNDAMENTALS.EX06_BASIC;

import java.util.Scanner;

public class E07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sum = 0;
        double price = 0;
        boolean isValid = true;

        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.0 || coins == 2.0) {
                sum += coins;

            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            command = scanner.nextLine();
        }
        command = scanner.nextLine();

        while (!command.equals("End")) {
            switch (command) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    isValid = false;
                    System.out.println("Invalid product");
                    break;
            }

            if (sum >= price && isValid) {
                sum -= price;
                System.out.printf("Purchased %s%n", command);

            } else if (price > sum){
                System.out.println("Sorry, not enough money");
            }

            command = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}

