package FUNDAMENTALS.EX18_LISTS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E09_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;

        while (sequence.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            int value = 0;

            if (index < 0) {
                value = sequence.get(0);
                sum += sequence.get(0);
                sequence.remove(0);
                sequence.add(0, (sequence.get(sequence.size() - 1)));

            } else if (index >= sequence.size()) {
                value = sequence.get(sequence.size() - 1);
                sum += sequence.get(sequence.size() - 1);
                sequence.remove(sequence.size() - 1);
                sequence.add(sequence.size(), sequence.get(0));

            } else {
                value = sequence.get(index);
                sum += sequence.get(index);
                sequence.remove(index);

            }
            for (int i = 0; i < sequence.size(); i++) {
                if (sequence.get(i) <= value) {
                    sequence.set(i, (sequence.get(i) + value));
                } else {
                    sequence.set(i, (sequence.get(i) - value));
                }
            }
        }
        System.out.println(sum);
    }
}
