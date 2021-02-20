package FUNDAMENTALS.EX21_OBJECTS_AND_CLASSES;

import java.util.*;

public class E01_AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> phrases = new ArrayList<>(Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."));
        List<String> events = new ArrayList<>(Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"));
        List<String> authors = new ArrayList<>(Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));
        List<String> cities = new ArrayList<>(Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int phraseIndex = random.nextInt(phrases.size() - 1);
            String phrase = phrases.get(phraseIndex);
            int eventIndex = random.nextInt(events.size() - 1);
            String event = events.get(eventIndex);
            int authorIndex = random.nextInt(authors.size() - 1);
            String author = authors.get(authorIndex);
            int cityIndex = random.nextInt(cities.size() - 1);
            String city = cities.get(cityIndex);

            System.out.printf("%s %s %s - %s%n", phrase, event, author, city);
        }

    }
}
