package FUNDAMENTALS.EX15_METHODS;

import java.util.Scanner;

public class E05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInteger = Integer.parseInt(scanner.nextLine());
        int secondInteger = Integer.parseInt(scanner.nextLine());
        int thirdInteger = Integer.parseInt(scanner.nextLine());

        int output = addAndSubtract(firstInteger, secondInteger, thirdInteger);

        System.out.println(output);

    }

    private static int addAndSubtract(int a, int b, int c) {
        return (a + b) - c;
    }

}
