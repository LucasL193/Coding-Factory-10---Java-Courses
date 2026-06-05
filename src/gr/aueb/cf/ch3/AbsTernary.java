package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο. Το πρόγραμμα
 * υπολογίζει το απόλυτο του ακεραίου. Το απόλυτο ενός
 * ακεραίου είναι πάντα θετικός αριθμός. Για παράδειγμα το
 * απόλυτο του -5 είναι 5. Το απόλυτο του 5 είναι 5
 */

public class AbsTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int abs = 0;

        System.out.println("Γράψτε έναν ακέραιο αριθμό");
        number = scanner.nextInt();
        abs = number > 0 ? number : number * -1;

        System.out.printf("Το απόλυτο του %d είναι %d \n", number, abs);
    }
}
