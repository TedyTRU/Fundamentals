package FUNDAMENTALS.LAB24_ASSOCIATIVE_ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class ex5 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(42, 13, 5, 111));

        numbers.stream().flatMap(new Function<Integer, Stream<?>>() {
            @Override
            public Stream<?> apply(Integer integer) {
                return null;
            }
        });


    }
}
