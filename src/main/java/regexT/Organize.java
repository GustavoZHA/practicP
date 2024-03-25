package regexT;

import java.util.regex.Pattern;

public class Organize {
    public String voltearString(String word) {
        if (word == null)
            throw new IllegalArgumentException("Null is not valid input");

        StringBuilder newString = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            newString.append(word.charAt(i));
        }
        System.out.println("Palabra volteada "+ newString.toString());
        return newString.toString();
    }

    public void isVowelPresent(String word) {
        Pattern pattern = Pattern.compile("[aeiou]");
        System.out.println(pattern.matcher(word.toLowerCase()).find());
    }
}
