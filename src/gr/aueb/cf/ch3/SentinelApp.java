package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει ακέραιους από το χρήστη μέχρι να δοθεί ο
 * ακέραιος (sentinel).
 */

public class SentinelApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο (-1 για έξοδο):");

        while ((num= in.nextInt()) != -1) {
            iterations++;
            System.out.println("Παρακαλώ εισάγετε έναν ακέραιο (-1 για έξοδο):");
        }

        System.out.printf("Ο χρήστης εισήγαγε %d ακεραίους πριν δώσει -1 ", iterations);
    }
}
