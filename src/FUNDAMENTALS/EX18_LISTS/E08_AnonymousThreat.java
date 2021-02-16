package FUNDAMENTALS.EX18_LISTS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> data = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String tokens = scanner.nextLine();

        while (!"3:1".equals(tokens)) {
            String[] token = tokens.split("\\s+");
            String command = token[0];
            int index = Integer.parseInt(token[1]);
            int partitions = Integer.parseInt(token[2]);

            if ("merge".equals(command)) {
                if (index < 0 || index >= data.size()) {
                    index = 0;
                }
                if (partitions >= data.size()) {
                    partitions = data.size() - 1;
                }
                StringBuilder merged = new StringBuilder();
                for (int i = index; i <= partitions; i++) {
                    merged.append(data.get(index));
                    data.remove(data.get(index));
                }
                data.add(index, merged.toString());

            } else if ("divide".equals(command)) {
                String element = data.get(index);
                data.remove(index);

                int length = element.length() / partitions;
                int lastLength = element.length() % partitions;
                int j = 0;
                StringBuilder newElement = new StringBuilder();

                for (int i = 1; i <= partitions; i++) {
                    if (i == partitions) {
                        for (int k = 0; k < lastLength; k++) {
                            newElement.append(element.charAt(j));
                            j++;
                        }
                    }
                    for (int k = 0; k < length; k++) {
                        newElement.append(element.charAt(j));
                        j++;
                    }
                    data.add(index, newElement.toString());
                    newElement = new StringBuilder();
                    index++;
                }
            }

            tokens = scanner.nextLine();
        }

        for (String datum : data) {
            System.out.print(datum + " ");
        }

    }
}
