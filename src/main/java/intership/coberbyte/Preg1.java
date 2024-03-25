package intership.coberbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Preg1 {

    /*
    Remove duplicate elements from an array
     */
    public void showNewList(String[] list) {
        System.out.println((Arrays.toString((list))));
        System.out.println((Arrays.toString(removeDuplicate(list))));
    }

    private String[] removeDuplicate(String[] list){

        List<String> newL = new ArrayList<>();
        newL.add(list[0]);

        for (String s : list) {
           String value = newL.stream().filter(e-> e.equals(s)).findFirst().orElse(null);
           if(value == null) {
               newL.add(s);
           }
        }
        return newL.toArray(new String[0]);
    }

    /**
     * Have the function (arr) take the
     * array of numbers stored n arr and determine the
     * total number of duplicate entries. For example if the
     * input is II, 2.2.2.31 then your program should output
     * 2 because there are two duplicates ot one of the
     * elements,
     */
    public void distinctList(Integer[] list) {
        int count = 0;
        for (int i = 0; i<list.length-1; i++) {
            if (list[i].equals(list[i + 1])){
                count++;
            }
        }
        System.out.println(count);
    }
}
