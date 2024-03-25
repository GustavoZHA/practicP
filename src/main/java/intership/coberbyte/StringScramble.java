package intership.coberbyte;

public class StringScramble {
    /**
     * Have the function StringScramble (str1 , str2
     * take both parameters being passed and return the
     * string true if a portion of str1 characters can be
     * rearranged to match otherwise return the string
     * false, For example: if str1 is •rkqodlw• and str2 iS
     * 'world' the output should return true Punctuation and
     * symbols Will not be entered with the parameters,
     */
    public void stringScramble(String str1, String str2){
        System.out.println(str1 + ":" + str2);

        String sin1 = str1;
        String sin2 = str2;
        if(str1.length() > str2.length()){
            sin1 = str2;
            sin2 = str1;
        }

        char[] sr1 = sin1.toCharArray();
        char[] sr2 = sin2.toCharArray();

        System.out.println(scramble(sr2,sr1));
    }

    private boolean scramble(char[] sr1,char[] sr2){
        boolean isFound = false;

        for (char c2 : sr2) {
            for (int i = 0; i < sr1.length; i++) {
                if (c2 == sr1[i]) {
                    sr1[i]='*';
                    isFound = true;
                    break;
                }
            }

            if (isFound) isFound = false;
            else return false;
        }
        return true;
    }

    public void stringScramble2(String str1, String str2){
        System.out.println(str1 + ":" + str2);
        for (int i = 0; i < str2.length(); i++) {
            char c2 = str2.charAt(i);
            int index = str1.indexOf(c2);

            if (index == -1) {
                System.out.println("False");
                return;
            }

            str1 = str1.substring(0,index) + str1.substring(index+1);
        }
        System.out.println("TRUE");
    }
}
