package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει τα base και power
 * και το πρόγραμμα υπολογίζει και εκτυπώνει το base στην power.
 */

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Εισάγετε τη βάση (base) και τη δύναμη (power):");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 0; i < power; i++){
            result *= base;
        }

        System.out.printf("Ο αριθμός %d υψωμένος στην %d είναι %d", base, power, result );

    }
}
