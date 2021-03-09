package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS;

import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {

        int min = Arrays.stream(new int[]{15, 25, 35}).min().orElse(3);
        System.out.println(min);

        List<Integer> integerAsList = Arrays.asList(1, 2, 3);
        integerAsList.stream().mapToInt(number -> number).min().getAsInt();

        List<String> nums = Arrays.asList("1", "2", "3");
        double avg = nums.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .getAsDouble();
        System.out.println(avg);


        // (Integer::parseInt)  ==>  (stringNumber -> Integer.parseInt(stringNumber))

    }
}
