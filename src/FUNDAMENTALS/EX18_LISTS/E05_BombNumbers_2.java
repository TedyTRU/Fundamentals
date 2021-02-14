package FUNDAMENTALS.EX18_LISTS;

import java.util.Arrays;
import java.util.Scanner;

public class E05_BombNumbers_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sequence = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int bombNumber = arr[0];
        int power = arr[1];
        int sum = 0;

        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == bombNumber) {
                sequence[i] = 0;
                for (int j = 1; j <= power; j++) {
                    if (i + j < sequence.length) {
                        sequence[i + j] = 0;
                    }
                    if (i - j >= 0) {
                        sequence[i - j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < sequence.length; i++) {
            sum += sequence[i];
        }
        System.out.println(sum);
    }
}
