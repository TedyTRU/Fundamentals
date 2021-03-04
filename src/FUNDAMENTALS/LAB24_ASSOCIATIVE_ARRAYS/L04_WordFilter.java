package FUNDAMENTALS.LAB24_ASSOCIATIVE_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class L04_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = Arrays.stream(scanner.nextLine().split(" ")).filter(e -> e.length() % 2 == 0).toArray(String[]::new);

        for (String word : line) {
            System.out.println(word);
        }

    }
}
