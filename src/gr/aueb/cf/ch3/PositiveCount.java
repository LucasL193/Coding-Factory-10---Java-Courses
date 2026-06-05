package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετράει το πλήθος των θετικών ακεραίων που δίνει
 * ο χρήστης και σταματάει όταν ο χρήστης δώσει έναν
 * αρνητικό ακέραιο.
 */

public class PositiveCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο (Αρνητικός για έξοδο):");
        num = scanner.nextInt();

        while (num>=0) {
            positivesCount++;
            System.out.println("Παρακαλώ εισάγετε έναν ακέραιο (Αρνητικός για έξοδο):");
            num = scanner.nextInt();
        }

        System.out.println("Το πλήθος των θετικώ είναι: " + positivesCount);
    }
}
