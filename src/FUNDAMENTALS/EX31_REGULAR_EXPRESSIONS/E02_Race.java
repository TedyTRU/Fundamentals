package FUNDAMENTALS.EX31_REGULAR_EXPRESSIONS;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class E02_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> racers = new LinkedHashMap<>();
        participants.forEach(e -> racers.put(e, 0));

        String regexName = "[A-Za-z]+";
        String regexDistance = "\\d";
        Pattern patternName = Pattern.compile(regexName);
        Pattern patternDistance = Pattern.compile(regexDistance);

        String line = scanner.nextLine();

        while (!"end of race".equals(line)) {

            Matcher matcherName = patternName.matcher(line);
            StringBuilder name = new StringBuilder();
            while (matcherName.find()) {
                name.append(matcherName.group());

            }
            if (racers.containsKey(name.toString())) {
                Matcher matcherDistance = patternDistance.matcher(line);
                int distance = 0;
                while (matcherDistance.find()) {
                    distance += Integer.parseInt(matcherDistance.group());
                }

                int totalDistance = racers.get(name.toString()) + distance;
                racers.put(name.toString(), totalDistance);

            }
            line = scanner.nextLine();
        }

        //List<String> count = Arrays.asList("1st place: ", "2nd place: ", "3rd place: ");

        List<String> count = new ArrayList<>();
        count.add("1st place: ");
        count.add("2nd place: ");
        count.add("3rd place: ");

        racers.entrySet().stream()
                //.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(3)
                .forEach((racer) -> {
                    System.out.println(count.remove(0) + racer.getKey());
                });

//        List<String> firstThree = racers.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .limit(3)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//
//        System.out.println("1st place: " + firstThree.get(0));
//        System.out.println("2nd place: " + firstThree.get(1));
//        System.out.println("3rd place: " + firstThree.get(2));

    }
}


/*

Rick, Negan, Lucille, Peter, Stamat,  George
R****i22c00k199!!!
N***&^e989ga(*&^&^&n323)))
*^%%Pe87876t&&^er87#$&(%)
L&^%u9754cille*&^&%^234
R**%^&%i11c104k123!^&!!
R&&%^&%ic10^$@k123!^&!!
*^%Peter8675
*^%Geo$12#%112r^$ge23!(@^)
!!22!P23!e!t!e!r!85
end of race

1st place: Peter
2nd place: Rick
3rd place: Negan

 */