package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα θετικό ακέραιο, έστω n,
 * και το πρόγραμμα εμφανίζει τόσα αστεράκια σε οριζόντια διάταξη
 * όσα ο αριθμός που εισήγαγε ο χρήστης.
 */

public class StarsFlex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int i = 1;

        System.out.println("Παρακαλώ δώστε αριθμό *");
        n = scanner.nextInt();

        while (i <= n){
            System.out.print("*");
            i++;
        }

    }
}
