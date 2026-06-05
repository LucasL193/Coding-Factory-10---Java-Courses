package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει με τη χρήση το παραγοντικό του n,
 * όπου n! = 1 * 2 * 3 * ... * n
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int result = 0;

        System.out.println("Δώστε έναν θετικό ακέραιο:");
        n = in.nextInt();

        result = facto(n);

        System.out.println("Το παραγοντικό του " + n + " είναι: " + result);
    }

    /**
     * Calculates factorial of n.
     *
     * @param n the number to calculate factorial
     * @return the factorial of n
     */

    public static int facto(int n){
        int result = 1;

        for (int i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }
}
