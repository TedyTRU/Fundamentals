package FUNDAMENTALS.LAB24_ASSOCIATIVE_ARRAYS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L05_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        List<Integer> collect = Arrays.stream(scanner.nextLine().split(" "))
//                .map(s -> Integer.parseInt(s))
//                .sorted((n1, n2) -> n2.compareTo(n1))
//                .limit(3)
//                .collect(Collectors.toList());
//
//        for (Integer integer : collect) {
//            System.out.print(integer + " ");
//        }


        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((e1, e2) -> e2.compareTo(e1))
                .limit(3)
                .forEach(i -> System.out.print(i + " "));

    }
}
