package FUNDAMENTALS.LAB24_ASSOCIATIVE_ARRAYS;

import java.util.*;
import java.util.stream.Collectors;

public class L01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double, Integer> numbers = new TreeMap<>();

        for (double num : line) {
            Integer occurrences = numbers.get(num);
            if (occurrences == null) {
                occurrences = 0;
            }
            numbers.put(num, occurrences + 1);
        }

        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
