package FUNDAMENTALS.LAB24_ASSOCIATIVE_ARRAYS;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex4 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(13);
        numbers.add(68);
        numbers.add(111);
        numbers.add(256);
        Stream<Integer> stream = numbers.stream();





        List<String> num = new ArrayList<>();
        num.add("42.3");
        num.add("68");
        num.add("13.7");

        double sum = num.stream().mapToDouble(i -> Double.parseDouble(i)).sum();
        System.out.println(sum);

        OptionalDouble min = num.stream().mapToDouble(i -> Double.parseDouble(i)).min();
        if (min.isPresent()) {
            System.out.println(min.getAsDouble());
        } else {
            System.out.println("No value");
        }






        int[] numbersArray = new int[] {42, 13, 68, 111, 256};
        IntStream stream1 = Arrays.stream(numbersArray);


    }
}
