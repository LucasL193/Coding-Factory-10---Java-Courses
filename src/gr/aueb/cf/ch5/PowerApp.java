package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει τη Δύναμη a^b με μέθοδο
 */

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 0;

        System.out.println("Δώστε δύο αριθμούς όπου a^b ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        result = pow(a, b);

        System.out.println("a^b = " + result);
    }

    /**
     *
     * @param a βάση
     * @param b δύναμη
     * @return το αποτέλεσμα a^b
     */
    public static int pow(int a, int b){
        int result = 1;

        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;

    }
}
