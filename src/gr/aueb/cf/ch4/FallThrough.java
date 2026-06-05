package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Fall through demo of switch / case .
 * Ο χρήστης δίνει ένα βαθμό και επιστρέφουμε
 * feedback
 */

public class FallThrough {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = 0;

        System.out.println("Δώσε έναν βαθμό (1-10)");
        grade = in.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Αποτυχία");
                break;
            case 5:
            case 6:
                System.out.println("Καλώς");
            case 7:
            case 8:
                System.out.println("Λίαν Καλώς");
                break;
            case 9:
            case 10:
                System.out.println("Άριστα");
                break;
            default:
                System.out.println("Μη έγκυρος βαθμός. Παρακαλώ δώστε έναν αριθμό μεταξύ 1 και 10");
                break;
        }

    }
}
