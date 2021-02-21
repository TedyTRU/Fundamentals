package FUNDAMENTALS.EX21_OBJECTS_AND_CLASSES.Е04_Articles_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Article> listOfArticles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String title = input.split(", ")[0];
            String content = input.split(", ")[1];
            String author = input.split(", ")[2];

            Article article = new Article(title, content, author);
            listOfArticles.add(article);
        }
        String command = scanner.nextLine();

        if (command.equals("title")) {

            listOfArticles.sort(Comparator.comparing(Article::getTitle));
            for (Article article : listOfArticles) {
                System.out.println(article.toString());
            }

        } else if (command.equals("content")) {

            listOfArticles.sort(Comparator.comparing(Article::getContent));
            for (Article article : listOfArticles) {
                System.out.println(article.toString());
            }

        } else if (command.equals("author")) {

            listOfArticles.sort(Comparator.comparing(Article::getAuthor));
            for (Article article : listOfArticles) {
                System.out.println(article.toString());
            }

        }

    }
}
