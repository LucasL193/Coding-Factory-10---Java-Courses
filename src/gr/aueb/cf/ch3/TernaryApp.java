package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τριαδικός τελεστής για τον υπολογισμό μικρότερου
 * μεταξύ δύο ακαιραίων.
 */

public class TernaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Εισάγετε δύο ακεραίους:");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        min = num1 > num2 ? num2 : num1;

        System.out.println(min);
    }
}
