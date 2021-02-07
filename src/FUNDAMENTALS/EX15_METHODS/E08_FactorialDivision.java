package FUNDAMENTALS.EX15_METHODS;

import java.util.Scanner;

public class E08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        double division = (double) getFactorial(firstNum) / getFactorial(secondNum);
        System.out.printf("%.2f", division);
    }

    private static long getFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}