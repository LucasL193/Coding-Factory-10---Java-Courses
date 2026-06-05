package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ακεραίου προσπαθώντας
 * να μαντέψει ένα μυστικό ακέραιο.
 */

public class SecretApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 12;
        int guess = 0;

        System.out.println("Προσπάθησε να μαντέψεις τον μυστικό αριθμό");
        guess = scanner.nextInt();

        if (guess == SECRET){
            System.out.println("Συγχαρητήρια");
        }
        else System.out.println("Λάθος");
    }
}
