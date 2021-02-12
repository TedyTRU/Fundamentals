package FUNDAMENTALS.LAB17_LISTS;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L03_MergingLists_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> mergedList = new ArrayList<>();

        int indexOfFirst = 0;
        int indexOfSecond = 0;

        while (indexOfFirst < firstList.size() || indexOfSecond < secondList.size()) {

            if (indexOfFirst < firstList.size()) {
                mergedList.add(firstList.get(indexOfFirst));
            }
            if (indexOfSecond < secondList.size()) {
                mergedList.add(secondList.get(indexOfSecond));
            }

            indexOfFirst++;
            indexOfSecond++;
        }
        for (Integer integer : mergedList) {
            System.out.print(integer + " ");
        }

    }
}
