package FUNDAMENTALS.LAB14_METHODS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(calculate(firstNum, operator, secondNum)));
    }

    private static double calculate(int a, String operator, int b) {
        double result = 0.0;

        switch (operator) {
            case "/":
                result = (double) a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
        }

        return result;
    }
}
