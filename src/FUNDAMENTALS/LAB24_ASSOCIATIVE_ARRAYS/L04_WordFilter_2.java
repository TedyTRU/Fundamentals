package FUNDAMENTALS.LAB24_ASSOCIATIVE_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class L04_WordFilter_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" "))
                .filter(word -> word.length() % 2 == 0)
                .forEach(word -> System.out.println(word));

    }
}
