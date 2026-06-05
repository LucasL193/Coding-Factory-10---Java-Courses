package gr.aueb.cf.ch2;

/**
 *  ο χρήστης εισάγει την ηλικία του σε έτη (έστω ακέραιος)
 *   και το πρόγραμμα επιστρέφει την ηλικία του σε ημέρες,
 *   όπου 1 έτος = 365 ημέρες. Για παράδειγμα. αν δοθείς ηλικία 2 ετών,
 *   το αποτέλεσμα θα είναι 730 ημέρες
 */

import java.util.Scanner;

public class YearsToDays {
    public static void main(String[] args) {
        final int DAYS_IN_A_YEAR = 365;
        int age = 0;
        int ageInDays = 0;

        //Input and Data binding
        Scanner scanner = new Scanner(System.in);
        System.out.println("Παρακαλώ πείτε την ηλικία σας");

        //Λογική της εφαρμοφής
        age = scanner.nextInt();
        ageInDays = age * DAYS_IN_A_YEAR;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Είστε %d ημερών", ageInDays );



    }
}
