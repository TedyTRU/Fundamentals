package FUNDAMENTALS.EX15_METHODS;

import java.util.Scanner;

public class E01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallestOfThreeNumbers(firstNum, secondNum, thirdNum));

    }

    private static int getSmallestOfThreeNumbers(int a, int b, int c) {
        int num = Math.min(a, b);
        num = Math.min(num, c);
        return num;
    }
}
