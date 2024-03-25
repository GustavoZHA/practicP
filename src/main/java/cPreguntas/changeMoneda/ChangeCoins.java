package cPreguntas.changeMoneda;

import java.util.Arrays;
import java.util.List;

public class ChangeCoins {
    private List<Integer> valueBills = Arrays.asList(10,20,50,100,200);

    public void change(int changeMax, int value) {
        int index = valueBills.indexOf(changeMax);

        for (int i = index; i > 0; i--) {
            value = countBills(valueBills.get(i),value);
            if (value < 10) break;
        }
       analyzeCoins(value);
    }

    private int countBills(int bill, int value) {
        System.out.println(String.format("We have %d bill(s) of %d",value/bill, bill));
        return  value % bill;
    }

    private void analyzeCoins(int value) {
        System.out.println( (value == 0) ? "There is no coins" : value + " coin(s)");
    }
}
