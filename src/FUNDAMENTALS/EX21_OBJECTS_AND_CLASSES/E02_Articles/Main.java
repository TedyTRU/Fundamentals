package FUNDAMENTALS.EX21_OBJECTS_AND_CLASSES.E02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];

        Article article = new Article(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String token = scanner.nextLine();
            String command = token.split(": ")[0];
            String newData = token.split(": ")[1];

            if (command.equals("Edit")) {
                article.edit(newData);

            } else if (command.equals("ChangeAuthor")) {
                article.changeAuthor(newData);

            } else if (command.equals("Rename")) {
                article.rename(newData);

            }
        }
        System.out.println(article.toString());
    }
}
