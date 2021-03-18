package FUNDAMENTALS.FINAL_EXAM.IV;

import java.util.Scanner;

public class FE01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String line = scanner.nextLine();

        while (!"Done".equals(line)) {
            StringBuilder rawPassword = new StringBuilder();
            String command = line.split(" ")[0];

            if ("TakeOdd".equals(command)) {
                for (int i = 1; i < password.length(); i += 2) {
                    char symbol = password.charAt(i);
                    rawPassword.append(symbol);
                }
                password = rawPassword.toString();
                System.out.println(password);

            } else if ("Cut".equals(command)) {
                int index = Integer.parseInt(line.split(" ")[1]);
                int length = Integer.parseInt(line.split(" ")[2]);
                int endIndex = index + length;

                rawPassword.append(password);
                rawPassword.delete(index, endIndex);
                password = rawPassword.toString();

                System.out.println(password);

            } else if ("Substitute".equals(command)) {
                String substring = line.split(" ")[1];
                String substitute = line.split(" ")[2];

                if (password.contains(substring)) {
                    password = password.replace(substring, substitute);
                    System.out.println(password);

                } else {
                    System.out.println("Nothing to replace!");
                }
            }

            line = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", password);
    }
}
