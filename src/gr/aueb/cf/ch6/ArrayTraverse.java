package gr.aueb.cf.ch6;

/**
 * Traverse an array. Επίσκεψη σε κάθε στοιχείο
 * του πίνακα και εκτύπωση.
 */

public class ArrayTraverse {

    public static void main(String[] args) {
        int [] scores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Traverse the array using a for loop
        for (int i = 0; i<= scores.length - 1; i++) {
            System.out.println(scores[i]);
        }

        for (int score : scores) {
            System.out.println(score);
        }
    }

}
