package FUNDAMENTALS.MID_EXAM.I;

import java.util.Scanner;

public class ME01_ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sum = 0;

        while (true) {
            if (command.equals("special") || command.equals("regular")) {
                break;
            }
            double prices = Double.parseDouble(command);

            if (prices < 0) {
                System.out.println("Invalid price!");
            } else {
                sum += prices;
            }

            command = scanner.nextLine();
        }

        if (sum == 0) {
            System.out.println("Invalid order!");

        } else {
            double taxes = sum * 0.2;
            double totalPrice = sum + taxes;

            if (command.equals("special")) {
                totalPrice *= 0.9;
            }
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);
        }
    }
}
