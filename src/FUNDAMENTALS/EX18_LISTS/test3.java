package FUNDAMENTALS.EX18_LISTS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test3 {
    public static void main(String[] args) {

        List<String> schedule = new ArrayList<>(Arrays.asList("Methods", "Lists", "Arrays", "Databases", "Databases-Exercise"));
        String line = "Swap:Lists:Databases";
        String[] tokens = line.split(":");
        String command = tokens[0];
        String lessonTitle = tokens[1];
        String swappedLesson = tokens[2];


        String exercise = lessonTitle + "-Exercise";

        String swappedExercise = swappedLesson + "-Exercise";

        int index = schedule.indexOf(lessonTitle);
        int swappedIndex = schedule.indexOf(swappedLesson);

        if (schedule.contains(lessonTitle) && schedule.contains(swappedLesson)) {
            schedule.set(index, swappedLesson);
            schedule.set(swappedIndex, lessonTitle);
        }

        if (schedule.contains(exercise)) {
            schedule.remove(exercise);
            schedule.add((swappedIndex + 1), exercise);
        }
        if (schedule.contains(swappedExercise)) {
            schedule.remove(swappedExercise);
            schedule.add(index + 1, swappedExercise);
        }



        int i = 1;
        for (String s : schedule) {
            System.out.println(i + "." + s);
            i++;
        }


    }
}
