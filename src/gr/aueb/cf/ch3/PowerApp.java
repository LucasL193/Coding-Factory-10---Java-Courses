package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει α**n. Ο χρήστης εισάγει το a και το n
 */

public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 0;

        System.out.println("Παρακαλώ εισάγετε τη βάση");
        base = in.nextInt();
        System.out.println("Παρακαλώ εισάγετε τη δύναμη");
        power = in.nextInt();

        while (i <= power){
            result *= base;
            i++;
        }

        System.out.printf("%d στη %d είναι %d", base, power, result);
    }
}
