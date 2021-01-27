package FUNDAMENTALS.EX12_ARRAYS;

import java.util.Scanner;

public class E03_Zig_ZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                firstArr[i] = Integer.parseInt(line[0]);
                secondArr[i] = Integer.parseInt(line[1]);
            } else {
                firstArr[i] = Integer.parseInt(line[1]);
                secondArr[i] = Integer.parseInt(line[0]);
            }

        }
        for (int first : firstArr) {
            System.out.print(first + " ");
        }

        System.out.println();

        for (int second : secondArr) {
            System.out.print(second + " ");
        }

    }
}
