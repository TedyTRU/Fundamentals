package FUNDAMENTALS.LAB17_LISTS;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> listOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < listOfNumbers.size() - 1; i++) {

            if (listOfNumbers.get(i).equals(listOfNumbers.get(i + 1))) {
                double sum = listOfNumbers.get(i) + listOfNumbers.get(i + 1);
                listOfNumbers.set(i, sum);
                listOfNumbers.remove(i + 1);
                i = -1;
            }

        }

        DecimalFormat decimalFormat = new DecimalFormat("0.#");

        for (Double listOfNumber : listOfNumbers) {
            System.out.print(decimalFormat.format(listOfNumber) + " ");
        }

    }
}
