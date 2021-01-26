package FUNDAMENTALS.LAB11_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class L05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumOfEvenNum = 0;
        int sumOfOddNum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumOfEvenNum += numbers[i];
            } else {
                sumOfOddNum += numbers[i];
            }
        }
        int difference = sumOfEvenNum - sumOfOddNum;
        System.out.println(difference);
    }
}
