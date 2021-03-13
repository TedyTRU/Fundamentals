package FUNDAMENTALS.EX28_TEXT_PROCESSING;

import java.math.BigInteger;
import java.util.Scanner;

public class E05_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger number = scanner.nextBigInteger();
        BigInteger digit = scanner.nextBigInteger();

        number = number.multiply(digit);

        System.out.println(number);
    }
}
