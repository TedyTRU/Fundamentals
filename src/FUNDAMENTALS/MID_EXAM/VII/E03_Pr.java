package FUNDAMENTALS.MID_EXAM.VII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E03_Pr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<String> chats = new ArrayList<>();

        while (!"end".equals(line)) {
            String command = line.split("\\s+")[0];
            String message = line.split("\\s+")[1];

            if (command.equals("Chat")) {
                chats.add(message);

            } else if (command.equals("Delete")) {
                chats.remove(message);

            } else if (command.equals("Edit")) {
                String editedMessage = line.split("\\s+")[2];
                int index = chats.indexOf(message);
                chats.set(index, editedMessage);

            } else if (command.equals("Pin")) {
                chats.remove(message);
                chats.add(message);

            } else if (command.equals("Spam")) {
                String[] spam = line.split("\\s+");

                //chats.addAll(Arrays.asList(spam));
                for (int i = 1; i < spam.length; i++) {
                    chats.add(spam[i]);
                }

            }

            line = scanner.nextLine();
        }

        //System.out.println(chats.toString().replaceAll("[\\[\\],]", "\n"));

        for (String chat : chats) {
            System.out.println(chat);
        }

    }
}
