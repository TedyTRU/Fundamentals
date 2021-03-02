package FUNDAMENTALS.MID_EXAM22.II;

import java.util.*;

public class ME03_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        double sum = 0;

        for (int number : arrayOfNumbers) {
            sum += number;
        }
        double average = sum / arrayOfNumbers.length;

        List<Integer> topNumbers = new ArrayList<>();

        for (int number : arrayOfNumbers) {
            if (number > average) {
                topNumbers.add(number);
            }
        }

        if (topNumbers.size() == 0) {
            System.out.println("No");

        } else if (topNumbers.size() < 5) {

            Collections.sort(topNumbers, Collections.reverseOrder());
            for (Integer topNumber : topNumbers) {
                System.out.print(topNumber + " ");
            }

        } else {

            Collections.sort(topNumbers, Collections.reverseOrder());
            for (int i = 0; i < 5; i++) {
                System.out.print(topNumbers.get(i) + " ");
            }
        }

    }
}
