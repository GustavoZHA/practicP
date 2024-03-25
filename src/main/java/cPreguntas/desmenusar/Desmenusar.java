package cPreguntas.desmenusar;

import java.util.ArrayList;
import java.util.List;

public class Desmenusar {
    private int number;
    private List<Integer> numbersList;

    public void desmenusar(String numberIn) {
        this.number = Integer.valueOf(numberIn);
        numbersList = new ArrayList<>();

        while (number>=0){
                numbersList.add(number%10);
                number = (number-number%10)/10;
        }
        showResult();
    }

    private void showResult(){
        numbersList.forEach(System.out::println);
    }
}
