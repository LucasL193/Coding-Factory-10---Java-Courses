package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * επαναληπτικά ο χρήστης προσπαθεί να μαντέψει
 * ένα μυστικό ακέραιο.
 */

public class SecretIterativeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 12;
        int guess = 0;

        while(true) {
            System.out.println("Προσπαθήστε να μεντέψετε τον μυστικό ακέραιο");
            guess = scanner.nextInt();

            if (guess == SECRET) {
               System.out.println("Μπράβο μαντέψατε σωστά");
               break;
            } else {
                System.out.println("Λυπάμαι μαντέψατε λάθος, προσπαθήστε ξανά");
            }
        }
    }
}
