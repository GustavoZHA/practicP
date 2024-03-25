package intership;

import java.util.List;

public class n1Ton10 {

    public void reverseString(String word) {
        System.out.println("The word to reverse " + word);
        if (word == null) throw new NullPointerException("Null value is invalid");

        StringBuilder newWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord.append(word.charAt(i));
        }
        System.out.println("The word is reversed: " + newWord.toString());
    }

    public void change2value(int a, int b) {
        System.out.println(String.format("The value a is %d and b is %d", a, b));
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(String.format("The value a is %d and b is %d", a, b));
    }

    public void verifyVowelPresent(String word) {
        boolean isVowel = word.toLowerCase().matches(".*[aeiou].*");
        System.out.println("The vowels IS" + (isVowel ? "" : "NOT") + " present");
    }

    public void verifyIsPrimeNumber(int number) {
        if (number == 0 || number == 1) {
            System.out.println("Is NOT Prime");
            return;
        }
        if (number == 2) {
            System.out.println("Is Prime");
            return;
        }

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Is NOT Prime");
                return;
            }
        }

        System.out.println("Is Prime");
    }

    public void fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        if (n < 0) System.out.println("The number should be positive and mayor than 0");
        StringBuilder serie = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            switch (i) {
                case 1:
                    serie.append("0,");
                    break;
                case 2:
                    serie.append("1,");
                    break;
                default:
                    n3 = n1 + n2;
                    serie.append(n1 + n2 + ",");
                    n1 = n2;
                    n2 = n3;
                    break;
            }
        }
        System.out.println(serie.toString().substring(0, serie.length() - 1));
    }

    public void verifyIsOdd(List<Integer> number) {
        if (number == null) throw new NullPointerException("Enter a value");

        for (Integer integer : number) {
            if (integer % 2 == 0) {
                System.out.println("The list has " + integer + " not is odd");
                return;
            }
        }
        System.out.println("the list of integers contains only odd");

    }

    public void verifyIsOdd2(List<Integer> number) {
        boolean res = number.parallelStream().anyMatch(n -> n%2==0);
        System.out.println("the lost of integers " + (res? "NOT": "") + " contains only odd");
    }

    public void nameClass(){
        System.out.println(this.getClass().getSimpleName());
    }
}

