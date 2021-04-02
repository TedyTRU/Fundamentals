package FUNDAMENTALS.FINAL_EXAM.I;

import java.util.*;

public class E03_ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> pieces = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String piece = line.split("\\|")[0];
            String composer = line.split("\\|")[1];
            String key = line.split("\\|")[2];

            pieces.put(piece, Arrays.asList(composer, key));
        }
        String commands = scanner.nextLine();
        while (!"Stop".equals(commands)) {
            String command = commands.split("\\|")[0];
            String piece = commands.split("\\|")[1];

            if ("Add".equals(command)) {
                String composer = commands.split("\\|")[2];
                String key = commands.split("\\|")[3];

                if (pieces.containsKey(piece)) {
                    System.out.printf("%s is already in the collection!%n", piece);
                } else {
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    pieces.put(piece, Arrays.asList(composer, key));
                }

            } else if ("Remove".equals(command)) {
                if (pieces.containsKey(piece)) {
                    pieces.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }

            } else if ("ChangeKey".equals(command)) {
                String newKey = commands.split("\\|")[2];

                if (pieces.containsKey(piece)) {
                    pieces.get(piece).set(1, newKey);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }

            }
            commands = scanner.nextLine();
        }

        pieces.entrySet().stream()
                //.sorted((s1, s2) -> s1.getKey().compareTo(s2.getKey()))
                //.sorted((e1, e2) -> e1.getValue().get(0).compareTo(e2.getValue().get(1)))
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));

    }
}
