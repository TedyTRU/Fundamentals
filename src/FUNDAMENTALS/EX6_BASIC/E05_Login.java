package FUNDAMENTALS.EX6_BASIC;

import java.util.Scanner;

public class E05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }

        String line = scanner.nextLine();

        for (int i = 0; i < 4; i++) {

            if (line.equals(password)) {
                System.out.printf("User %s logged in.%n", username);
                break;

            } else {
                if (i == 3) {
                    System.out.printf("User %s blocked!%n", username);

                } else {
                    System.out.println("Incorrect password. Try again.");
                    line = scanner.nextLine();
                }
            }
        }
    }
}
