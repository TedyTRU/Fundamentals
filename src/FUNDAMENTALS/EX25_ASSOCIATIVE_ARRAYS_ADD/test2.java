package FUNDAMENTALS.EX25_ASSOCIATIVE_ARRAYS_ADD;

import java.util.LinkedHashMap;
import java.util.Map;

public class test2 {
    public static void main(String[] args) {

        Map<String, int[]> test = new LinkedHashMap<>();
        test.put("A", new int[2]);
        test.get("A")[0] = 3;
        test.get("A")[1] = 2;
        test.put("B", new int[2]);
        test.get("B")[0] = 4;
        test.get("B")[1] = 1;
        test.put("C", new int[2]);
        test.get("C")[0] = 3;
        test.get("C")[1] = 4;
        test.put("D", new int[2]);
        test.get("D")[0] = 3;
        test.get("D")[1] = 2;
        //<- Резултатът от .sorted((a, b) е в низходящ ред !!!
        test.entrySet().stream().sorted((a, b) -> {
            int result = Integer.compare(b.getValue()[0], a.getValue()[0]);//<-Сортираме по първата стойност
            if (result == 0) { //<-Ако тя е равна
                result = a.getKey().compareTo(b.getKey());//<-Сортираме по ключ
            }
            return result;
        }).forEach(e -> System.out.printf("%s%n key1: %d%n key2: %d%n",
                e.getKey(), e.getValue()[0], e.getValue()[1]));
        System.out.println("--------");

        test.entrySet().stream().sorted((a, b) -> {
            int result = Integer.compare(b.getValue()[1], a.getValue()[1]);//<-Сортираме по втората стойност
            if (result == 0) {//<-Ако тя е равна
                result = a.getKey().compareTo(b.getKey());//<-Сортираме по ключ
            }
            return result;
        }).forEach(e -> System.out.printf("%s%n key1: %d%n key2: %d%n",
                e.getKey(), e.getValue()[0], e.getValue()[1]));
        System.out.println("--------");

        test.entrySet().stream().filter(a -> a.getValue()[1] >= 2)//<-Филтрираме втората стойност да е >=2
                .sorted((a, b) -> {
                    int result = Integer.compare(b.getValue()[1], a.getValue()[1]);//<-Сортираме по втората стойност
                    if (result == 0) {//<-Ако тя е равна
                        result = result = Integer.compare(b.getValue()[0], a.getValue()[0]);//<-Сортираме по първата стойност
                        if (result == 0) {//<-Ако тя е равна
                            result = a.getKey().compareTo(b.getKey());//<-Сортираме по ключ
                        }
                    }
                    return result;
                }).forEach(e -> System.out.printf("%s%n key1: %d%n key2: %d%n",
                e.getKey(), e.getValue()[0], e.getValue()[1]));
    }
}
