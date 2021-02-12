package FUNDAMENTALS.LAB17_LISTS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i <= numbers.size() / 2; i++) {
            int sum = numbers.get(i) + numbers.get(numbers.size() - 1);
            numbers.set(i, sum);
            numbers.remove(numbers.size() - 1);
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
