package FUNDAMENTALS.LAB17_LISTS;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L01_SumAdjacentEqualNumbers_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        int i = 0;
        while (i < numbers.size() - 1) {

            if (numbers.get(i).equals(numbers.get(i + 1))) {
                double sum = numbers.get(i) + numbers.get(i + 1);
                numbers.set(i, sum);
                numbers.remove(i + 1);
                i = 0;

            } else {
                i++;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double number : numbers) {
            System.out.print(decimalFormat.format(number) + " ");
        }

    }
}
