package intership.coberbyte;

public class RunLength {
    /**
     * Have the tuncuon take the str parameter
     * being passed and return a compressed version of the string
     * using the Rumlength encoding algorithm. This algorithm works
     * by taking the occurrence of each repeating character and
     * outputting that number along with a Stngle Character of the
     * repeating sequence. For example •wwwggopp• would return
     * 3w2g102p The string wtll not contain any numbers,
     * punctuation, or symbols.
     */
    public void runLength(String str) {
        StringBuilder res = new StringBuilder();
        char n = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (n == str.charAt(i)) {
                count++;
            } else {
                res.append(count).append(n);
                n = str.charAt(i);
                count = 1;
            }
        }
        res.append(count).append(n);

        System.out.println(res.toString());
    }

    public void runLength2(String str) {
        StringBuilder res = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else {
                res.append(count).append(str.charAt(i));
                count = 1;
            }
        }
        res.append(count).append(str.charAt(str.length()-1));
        System.out.println(res.toString());
    }
}
