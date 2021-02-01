package FUNDAMENTALS.EX12_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class E07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        int count = 0;
        int element = 0;
        int currentCount = 0;

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] == array[i + 1]) {
                currentCount++;
            } else {
                currentCount = 0;
            }
            if (currentCount > count) {
                count = currentCount;
                element = array[i];
            }
        }
        if (count == 0) {
            element = array[0];
        }
        for (int j = 0; j < count + 1; j++) {
            System.out.print(element + " ");
        }
    }
}
