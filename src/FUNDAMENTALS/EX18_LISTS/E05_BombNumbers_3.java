package FUNDAMENTALS.EX18_LISTS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_BombNumbers_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] bombNumber = scanner.nextLine().split("\\s+");
        int bomb = Integer.parseInt(bombNumber[0]);
        int power = Integer.parseInt(bombNumber[1]);

        for (int i = 0; i < sequence.size(); i++) {
            if (bomb == sequence.get(i)) {

                int leftIndex = Math.max(i - power, 0);
                int rightIndex = Math.min(i + power, sequence.size() - 1);
                sequence.subList(leftIndex, rightIndex + 1).clear();
                i = 0;

            }
        }
        int sum = sequence.stream().mapToInt(e->e).sum();
        System.out.println(sum);
    }
}
