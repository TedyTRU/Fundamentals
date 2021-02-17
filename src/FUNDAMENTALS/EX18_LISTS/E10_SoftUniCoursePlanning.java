package FUNDAMENTALS.EX18_LISTS;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String line = scanner.nextLine();

        while (!"course start".equals(line)) {
            String[] tokens = line.split(":");
            String command = tokens[0];
            String lessonTitle = tokens[1];
            String exercise = lessonTitle + "-Exercise";

            if ("Add".equals(command)) {
                if (!schedule.contains(lessonTitle)) {
                    schedule.add(lessonTitle);
                }

            } else if ("Insert".equals(command)) {
                int index = Integer.parseInt(tokens[2]);
                if (!schedule.contains(lessonTitle)) {
                    schedule.add(index, lessonTitle);
                }

            } else if ("Remove".equals(command)) {
                schedule.remove(lessonTitle);
                schedule.remove(exercise);

            } else if ("Swap".equals(command)) {
                String swappedLesson = tokens[2];
                String swappedExercise = swappedLesson + "-Exercise";
                int index = schedule.indexOf(lessonTitle);
                int swappedIndex = schedule.indexOf(swappedLesson);

                if (schedule.contains(lessonTitle) && schedule.contains(swappedLesson)) {
                    schedule.set(index, swappedLesson);
                    schedule.set(swappedIndex, lessonTitle);
                }
                if (schedule.contains(exercise)) {
                    schedule.remove(exercise);
                    schedule.add(swappedIndex + 1, exercise);
                }
                if (schedule.contains(swappedExercise)) {
                    schedule.remove(swappedExercise);
                    schedule.add(index + 1, swappedExercise);
                }

            } else if ("Exercise".equals(command)) {
                if (schedule.contains(lessonTitle)) {
                    if (!schedule.contains(exercise)) {
                        int index = schedule.indexOf(lessonTitle) + 1;
                        schedule.add(index, exercise);
                    }
                } else {
                    schedule.add(lessonTitle);
                    schedule.add(exercise);
                }
            }

            line = scanner.nextLine();
        }

        int i = 1;
        for (String s : schedule) {
            System.out.println(i + "." + s);
            i++;
        }

    }
}
