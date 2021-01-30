package FUNDAMENTALS.EX12_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class E04_ArrayRotation_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int countRotations = Integer.parseInt(scanner.nextLine());
        //[51, 47, 32, 61, 21]
        for (int rotation = 1; rotation <= countRotations; rotation++) {
            //1. взимам първия елемент
            //2. премествам всички елементи
            //3. слагаме първия елемент на последна позиция
            int firstNumber = numbers[0];
            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];

            }
            numbers[numbers.length - 1] = firstNumber;
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
