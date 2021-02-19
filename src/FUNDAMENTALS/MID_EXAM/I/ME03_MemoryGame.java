package FUNDAMENTALS.MID_EXAM.I;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ME03_MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> sequence = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();
        int count = 0;

        while (!"end".equals(input)) {
            String[] tokens = input.split(" ");
            int firstIndex = Integer.parseInt(tokens[0]);
            int secondIndex = Integer.parseInt(tokens[1]);
            count++;

            if (firstIndex == secondIndex || firstIndex < 0 ||
            secondIndex < 0 || firstIndex >= sequence.size() ||
            secondIndex >= sequence.size()) {
                System.out.println("Invalid input! Adding additional elements to the board");
                int index = sequence.size() / 2;
                String element = "-" + count + "a";
                sequence.add(index, element);
                sequence.add((index + 1), element);

            } else if (sequence.get(firstIndex).equals(sequence.get(secondIndex))) {
                System.out.printf("Congrats! You have found matching elements - %s!%n", sequence.get(firstIndex));
                sequence.set(firstIndex, "delete");
                sequence.remove(secondIndex);
                sequence.remove("delete");

            } else if (!sequence.get(firstIndex).equals(sequence.get(secondIndex))) {
                System.out.println("Try again!");

            }

            if (sequence.size() <= 0) {
                System.out.printf("You have won in %d turns!", count);
                break;
            }

            input = scanner.nextLine();
        }

        if (sequence.size() > 0) {
            System.out.println("Sorry you lose :(");
        }
        for (String s : sequence) {
            System.out.print(s + " ");
        }

    }
}
