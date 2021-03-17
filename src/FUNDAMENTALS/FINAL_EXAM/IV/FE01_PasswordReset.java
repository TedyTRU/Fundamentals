package FUNDAMENTALS.FINAL_EXAM.IV;

import java.util.Scanner;

public class FE01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String predefinedString = scanner.nextLine();
        String line = scanner.nextLine();
        StringBuilder rawPassword = new StringBuilder();

        while (!"Done".equals(line)) {
            String command = line.split(" ")[0];
            String password;

            if ("TakeOdd".equals(command)) {
                for (int i = 1; i < predefinedString.length(); i += 2) {
                    char symbol = predefinedString.charAt(i);
                    rawPassword.append(symbol);
                }
                System.out.println(rawPassword);

            } else if ("Cut".equals(command)) {
                int index = Integer.parseInt(line.split(" ")[1]);
                int length = Integer.parseInt(line.split(" ")[2]);
                int endIndex = index + length;

                rawPassword.delete(index, endIndex);
                System.out.println(rawPassword);

            } else if ("Substitute".equals(command)) {
                String substring = line.split(" ")[1];
                String substitute = line.split(" ")[2];

                if (rawPassword.toString().contains(substring)) {
                    String currentPass = rawPassword.toString();
                    currentPass = currentPass.replace(substring, substitute);
                    rawPassword.delete(0, rawPassword.length());
                    rawPassword.append(currentPass);
                    System.out.println(rawPassword.toString());

                } else {
                    System.out.println("Nothing to replace!");
                }
            }

            line = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", rawPassword.toString());
    }
}
