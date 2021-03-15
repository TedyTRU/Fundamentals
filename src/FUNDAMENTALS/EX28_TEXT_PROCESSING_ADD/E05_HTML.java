package FUNDAMENTALS.EX28_TEXT_PROCESSING_ADD;

import java.util.Scanner;

public class E05_HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String content = scanner.nextLine();
        String comments = scanner.nextLine();

        System.out.printf("<h1>%n    %s%n</h1>%n", title);
        System.out.printf("<article>%n    %s%n</article>%n", content);

        while (!"end of comments".equals(comments)) {

            System.out.printf("<div>%n    %s%n</div>%n", comments);

            comments = scanner.nextLine();
        }

    }
}
