package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέραιο που συμβολίζει
 * θερμοκρασία. Το πρόγραμμα υπολογίζει αν η θερμοκρασία
 * είναι < 0 μία μεταβλητή, έστω isTempBelowZero γίνεται true,
 * αλλιώς false. Τέλος εκτυπώνει το αποτέλεσμα.
 */

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isBelowZero = false;

        //input and data handling
        System.out.println("Παρακαλώ εισάγετε θερμοκρασία");
        temperature = scanner.nextInt();
        isBelowZero = temperature < 0;

        //Εκτύπωση αποτελεσμάτων
        System.out.println("Η θερμοκρασία είναι κάτω από το μηδέν?: " + isBelowZero);
    }
}
