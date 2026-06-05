package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη έναν ακέραιο που αντιστοιχεί
 * σε ώρες και τον μετατρέπει σε λεπτά και δεύτερα και τα
 * εκτυπώνει
 */

public class HoursToMinSec {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        Scanner scanner = new Scanner(System.in);
        final int MINUTES_IN_HOUR = 60;
        final int SECONDS_IN_MINUTE = 60;

        //Input - Data Binding
        System.out.println("Παρακαλώ εισάγετε τον αριθμό ωρών");
        hours = scanner.nextInt();

        //Λογική κώδικα
        minutes = hours * MINUTES_IN_HOUR;
        seconds = minutes * SECONDS_IN_MINUTE;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("%d ώρες είναι %d λεπτά και %d δεύτερα", hours, minutes, seconds);
    }

}
