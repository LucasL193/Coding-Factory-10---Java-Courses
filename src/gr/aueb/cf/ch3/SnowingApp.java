package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει αν βρέχει και τη θερμοκρασία και το πρόγραμμα
 * υπολογίζει αν χιονίζει. Χιονίζει σημαίνει ότι βρέχει και η θερμοκρασία είναι
 * κάτω από το μηδέν
 */

public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean belowZero = false;
        boolean isSnowing = false;
        int temperature = 0;

        //Input and data handling
        System.out.println("Βρέχει? (true/false)");
        isRaining = scanner.nextBoolean();
        System.out.println("Πόσους βαθμούς έχει έξω?");
        temperature = scanner.nextInt();

        //Λογική κώδικα
        belowZero = temperature < 0;
        isSnowing = belowZero && isRaining;

        //Εκτύπωση αποτελέσματος
        System.out.println("Χιονίζει :" + isSnowing);
    }
}
