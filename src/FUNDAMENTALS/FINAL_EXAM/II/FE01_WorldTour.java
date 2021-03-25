package FUNDAMENTALS.FINAL_EXAM.II;

import java.util.Scanner;

public class FE01_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stops = new StringBuilder(scanner.nextLine());
        String line = scanner.nextLine();

        while (!"Travel".equals(line)) {
            String[] commands = line.split(":");
            String command = commands[0];

            if (command.equals("Add Stop")) {
                int index = Integer.parseInt(commands[1]);
                String string = commands[2];

                if (isValid(index, stops)) {
                    stops.insert(index, string);
                }

            } else if (command.equals("Remove Stop")) {
                int startIndex = Integer.parseInt(commands[1]);
                int endIndex = Integer.parseInt(commands[2]);

                if (isValid(startIndex, stops) && isValid(endIndex, stops)) {
                    //stops.replace(startIndex, endIndex + 1, "");
                    stops.delete(startIndex, endIndex + 1);
                }

            } else if (command.equals("Switch")) {
                String oldString = commands[1];
                String newString = commands[2];

                //if (stops.toString().contains(oldString)) {
//                while (stops.indexOf(oldString) != -1) {
//                    int startIndex = stops.indexOf(oldString);
//                    int endIndex = startIndex + oldString.length();
//
//                    stops.replace(startIndex, endIndex, newString);
//                }                                                       => ABACD //Switch:A:AA

                String stopsAsString = stops.toString();
                if (stopsAsString.contains(oldString)) {
                    stopsAsString = stopsAsString.replace(oldString, newString);
                }
                stops = new StringBuilder(stopsAsString);
            }

            System.out.println(stops.toString());
            line = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + stops);

    }

    private static boolean isValid(int index, StringBuilder string) {
        if (index >= 0 && index < string.length()) {
            return true;
        }
        return false;
    }
}
