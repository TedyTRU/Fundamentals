package FUNDAMENTALS.EX18_LISTS;

import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static void main(String[] args) {

        List<String> data = new ArrayList<>();
        data.add("abcdef");
        data.add("ghi");
        data.add("jkl");

        int partitions = 3;
        int index = 0;

        String element = data.get(index);
        data.remove(index);

        StringBuilder newElement = new StringBuilder();

//        if ((element.length() / partitions) % 2 == 0) {
//
//            for (int i = 0; i < element.length(); i++) {
//                newElement.append(element.charAt(i));
//
//                if (newElement.length() == (element.length() / partitions)) {
//                    data.add(index, newElement.toString());
//                    newElement = new StringBuilder();
//                    index++;
//                }
//            }


//        } else if ((element.length() / partitions) % 2 != 0) {
            int length = element.length() / partitions;
            int lastLength = element.length() % partitions;
            int j = 0;

            for (int i = 1; i <= partitions; i++) {
                if (i == partitions) {
                    for (int k = 0; k < lastLength; k++) {
                        newElement.append(element.charAt(j));
                        j++;
                    }
                }
                for (int k = 0; k < length; k++) {
                    newElement.append(element.charAt(j));
                    j++;
                }
                data.add(index, newElement.toString());
                newElement = new StringBuilder();
                index++;
            }





        for (String datum : data) {
            System.out.print(datum + " ");
        }


    }
}
