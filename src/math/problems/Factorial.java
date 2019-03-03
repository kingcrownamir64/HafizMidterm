package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */

public class Factorial {

    public static int factorial(int n) {
        int output;
        if (n == 1) {
            return 1;
        }

        output = factorial(n - 1) * n;
        return output;
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        int num = 5;

        int factorialResult = factorial(num);

        System.out.println("Factorial of " + num + " is: " + factorialResult);
    }
}


