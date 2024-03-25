package intership.coberbyte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        String[] n1 = {"as","a","ap","as","a","as","a","as2","a",};
//
//        Preg1 preg1 = new Preg1();
//        preg1.showNewList(n1);
//
//        Integer[] n2 ={0,-2,-2,5,5,5};
//        Integer[] n3 = {100,2,101,4};
//
//        preg1.distinctList(n2);
//        preg1.distinctList(n3);

//        String[] n2 = {"(sas)a()", "(()())", ")()(","())"};
//
//        BracketMatcher bracketMatcher = new BracketMatcher();
//        for (String s : n2) {
//            System.out.println(s);
//            bracketMatcher.bracketMatcher(s);
//        }

//        FirstFactorial firstFactorial = new FirstFactorial();
//        int[] n = {1,2,4,8,0};
//        for (int i : n) {
////            firstFactorial.factorial(i);
//            firstFactorial.f2(i);
//        }

//        RunLength runLength = new RunLength();
//        String[] list = {"aabbcde","wwwbbbw","aswrrwdd","aswrrpddd","drdddddd"};
//        for (String s : list) {
//            //runLength.runLength(s);
//            runLength.runLength2(s);
//        }

//        StringScramble stringScramble = new StringScramble();
//        Map<String, String> maps = new HashMap<String, String>()
//        {
//            {
//                put("coder", "cdore");
//                put("h3llko", "hello");
//                put("rkqodlw","world");
//                put("erq","eerq");
//            }
//        };
//
////        maps.forEach((s1,s2) -> stringScramble.stringScramble(s1,s2));
//        maps.forEach(stringScramble::stringScramble2);

        ArrayAddition arrayAddition = new ArrayAddition();

        List<int[]> list = new ArrayList<>();

        int[] n = {1,2,4,8,0};
        int[] n1 = {1,2,4,8,1};
        int[] n2 = {4,6,23,10,1,3};
        int[] n3 = {5,7,16,1,2};
        int[] n4 ={3,5,-1,8,12};
        list.add(n);
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);


        for (int[] ints : list) {
            arrayAddition.arrayAddition(ints);
        }
    }
}

