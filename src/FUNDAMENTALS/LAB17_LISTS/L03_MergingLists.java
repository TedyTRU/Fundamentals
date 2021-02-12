package FUNDAMENTALS.LAB17_LISTS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int end = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < end; i++) {
            System.out.print(firstList.get(i) + " " + secondList.get(i) + " ");
        }

        if (secondList.size() > firstList.size()) {
            printTheRest(secondList, end);
        } else {
            printTheRest(firstList, end);
        }

    }

    private static void printTheRest(List<Integer> list, int end) {
        for (int i = end; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
