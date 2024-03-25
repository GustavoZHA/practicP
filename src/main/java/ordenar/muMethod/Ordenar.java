package ordenar.muMethod;

import java.util.ArrayList;
import java.util.List;

public class Ordenar {

    public void organizar(int[] listNumber) {

        List<Integer> finalList = new ArrayList<>();
        System.out.println(finalList);

        for (int i = 0; i < listNumber.length; i++) {
            int numberAnalyzed = listNumber[i];
            if (i == 0) finalList.add(numberAnalyzed);
            else if (finalList.get(0) > numberAnalyzed) {
                finalList.add(0, numberAnalyzed);
            } else if (finalList.get(finalList.size() - 1) < numberAnalyzed) {
                finalList.add(finalList.size(), numberAnalyzed);
            } else {
                for (Integer integer : finalList) {
                    if (integer >= numberAnalyzed) {
                        finalList.add(finalList.indexOf(integer), numberAnalyzed);
                        break;
                    }
                }
            }
            System.out.println(finalList);
        }
    }

    public void organizar2(int[] listNumber) {
        if (listNumber == null ) throw new NullPointerException("The list is empty");
        List<Integer> finalList = new ArrayList<>();
        System.out.println(listNumber);

        for (int i = 0; i < listNumber.length; i++) {
            int numberAnalyzed = listNumber[i];
            if (i == 0) finalList.add(numberAnalyzed);
            else {
                int j = 0;
                while (j < finalList.size()-1) {
                    j++;
                    if (finalList.get(j) >= numberAnalyzed) {
                        finalList.add(j-1, numberAnalyzed);
                        break;
                    }
                }
                if (j==finalList.size()-1) finalList.add( numberAnalyzed);
            }
            System.out.println(finalList);
        }
    }
}
