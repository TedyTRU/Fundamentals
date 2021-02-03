package FUNDAMENTALS.EX06_BASIC;

import java.util.Scanner;

public class E05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = username.length() - 1; i >= 0; i--) {
            passwordBuilder.append(username.charAt(i));
        }
        String password = passwordBuilder.toString();


        String line = scanner.nextLine();

        for (int i = 0; i < 4; i++) {

            if (password.equals(line)) {
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
