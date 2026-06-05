package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ανάλογα με το choice δίνουμε
 */

public class SwitchApp {
    public static void main(String[] args) {
        //Δήλωση και Αρχικοποίηση
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 5;

        // Εμφάνιση μενού και επεξεργασία επιλογών
        do {
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
            System.out.println("1. Προβολή προφίλ");
            System.out.println("2. Επεξεργασία προφίλ");
            System.out.println("3. Ρυθμίσεις");
            System.out.println("4. Βοήθεια");
            System.out.println("5. Έξοδος");

            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Επεξεργασία προφίλ...");
                    break;
                case 2:
                    System.out.println("Επεξεργασία προφίλ...");
                    break;
                case 3:
                    System.out.println("Ρυθμίσεις...");
                    break;
                case 4:
                    System.out.println("Βοήθεια...");
                    break;
                case EXIT:
                    System.out.println("Έξοδος από το πρόγραμμα");
                    break;
                default:
                    System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά.");
                    break;
            }

        } while (choice != EXIT);
    }
}
