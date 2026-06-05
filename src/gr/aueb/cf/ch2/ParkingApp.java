package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Σε ένα χώρο στάθμευσης η πρώτη ώρα κοστίζει 2 ευρώ (200 λεπτά) και
 * κάθε επιπλέον ώρα κοστίζει 1,5 ευρώ (150 λεπτά).
 * Ο χρήστης εισάγει τον αριθμό ωρών που στάθμευσε και το πρόγραμμα
 * επιστρέφει το συνολικό κόστος
 *
 * Αν για παράδειγμα ο χτήστης εισάγει 5 ώρες τότε το κόστος είναι
 */

public class ParkingApp {
    public static void main(String[] args) {
        final int FIRST_HOUR = 200;
        final int COST_PER_HOUR = 150;
        int hours = 0;
        int totalEuroCost = 0;
        int totalCentCost = 0;
        Scanner scanner = new Scanner(System.in);

        //input and data handling
        System.out.println("Παρακαλώ εισάγετε τις ώρες");
        hours = scanner.nextInt();
        totalEuroCost = (FIRST_HOUR + (hours - 1) * COST_PER_HOUR) / 100;
        totalCentCost = (FIRST_HOUR + (hours - 1) * COST_PER_HOUR) % 100;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Το αποτέλεσμα είναι %d ευρώ και %d λεπτά", totalEuroCost, totalCentCost);

    }
}
