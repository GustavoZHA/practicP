package intership.coberbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BracketMatcher {
    public void bracketMatcher(String word) {
        char[] cr = word.toCharArray();

        int countBra = 0;
        int countKet = 0;

        List<Character> listC = new ArrayList<>();
        for (char c : cr) {
            if ('(' == c) {
                countBra++;
                listC.add(c);
            }
            if (')' == c) {
                countKet++;
                listC.add(c);
            }
        }

        if (countKet != countBra) {
            System.out.println("False");
            return;
        }

        if (')' == listC.get(0) || '(' == listC.get(listC.size() - 1)) {
            System.out.println("False");
            return;
        }

        for (int i = 0; i < cr.length; i++) {
            listC = deleteBT(listC);
        }

        if(listC.size()==0){
            System.out.println("True");
            return;
        }

        System.out.println("False");

    }

    public List<Character> deleteBT(List<Character> listC) {
        for (int i = 0; i < listC.size() - 1; i++) {
            if ('(' == listC.get(i) & ')' == listC.get(i + 1)) {
                listC.remove(i);
                listC.remove(i);
                return listC;
            }
        }
        return listC;
    }
}
