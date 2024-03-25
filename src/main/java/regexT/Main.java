package regexT;

public class Main {
    public static void main(String[] args) {
        Organize organize = new Organize();
        organize.voltearString("hola");
        organize.isVowelPresent("hola");
        organize.isVowelPresent("hd213");

        empiesaChar("sad");
        empiesaChar("bdwa");
        empiesaChar("B1");
        finalChar("das");
        finalChar("asM");
        finalChar("M");
        finalChar("2134");
    }

    private static void isMatched(String regex,String word){
        System.out.print(word + " ");
        boolean isMatches = word.matches(regex);
        System.out.println(String.format("Is%s matched", isMatches? "":" not"));
        System.out.println(isMatches);
    }

    public static void empiesaChar(String word) {
        String regex = "^b";
        isMatched(regex, word);
    }

    public static void finalChar(String word) {
        String regex = "M$";
        isMatched(regex, word);
    }
}
