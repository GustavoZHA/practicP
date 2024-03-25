package intership.coberbyte;

public class FirstFactorial {

    /**
     * Have the function
     * FirstFactoria1 (num) take the num
     * parameter being passed and return the
     * factorial of it. For example: if num = 4,
     * then your program should return (4 * 3
     * 2 I) = 24. For the test cases, the range
     * will be between I and 18 and the input
     * will always be an integer.
      */

    public void factorial(int n){
        if (n ==0){
            System.out.println("0");
            return;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
    }

    public void f2(int n){
        System.out.println(factorial2(n));
    }

    private int factorial2(int n){
        if (n ==0||n==1){
            return 1;
        } else {
            return n*factorial2(n-1);
        }
    }
}
