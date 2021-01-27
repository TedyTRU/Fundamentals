package FUNDAMENTALS.EX12_ARRAYS;

import java.util.Scanner;

public class E01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfWagons = Integer.parseInt(scanner.nextLine());
        int[] train = new int [countOfWagons];
        int sum = 0;

        for (int i = 0; i < countOfWagons; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            train[i] = people;
            sum += people;
        }
        for (int i : train) {
            System.out.print(i + " ");
        }
//        System.out.println();
//        System.out.println(sum);
        System.out.println("\n" + sum);
    }
}
