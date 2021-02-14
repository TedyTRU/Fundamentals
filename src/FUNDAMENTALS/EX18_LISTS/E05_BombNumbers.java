package FUNDAMENTALS.EX18_LISTS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int bombNumber = arr[0];
        int power = arr[1];
        int sum = 0;

        for (int i = 0; i < sequence.size(); i++) {
            if (sequence.get(i) == bombNumber) {
                sequence.set(i, Integer.MAX_VALUE);
                for (int j = 1; j <= power; j++) {
                    if (i + j < sequence.size()) {
                        sequence.set((i + j), Integer.MAX_VALUE);
                    }
                    if (i - j >= 0) {
                        sequence.set((i - j), Integer.MAX_VALUE);
                    }
                }
            }
        }
        for (int i = 0; i < sequence.size(); i++) {
            if (sequence.get(i) != Integer.MAX_VALUE) {
                sum += sequence.get(i);
            }
        }
        System.out.println(sum);
    }
}
