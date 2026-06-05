package gr.aueb.cf.review;

/**
 * Δίνεται ως είσοδος δύο πίνακες - ένας για την Alice και ένας για τον Bob
 * που περιέχουν τρεις βαθμολογίες ο καθένας σε τρία μαθήματα (Μουσική, Μαθηματικά, Φυσική).
 * Κάθε βαθμός μπορεί να είναι από 1 εως 100.
 *
 * Αν η Alice έχει μεγαλύτερη βαθμολογία σε ένα μάθημα παίρνε 1 πόντος αλλιώς παίρνει ο Bob.
 * Αν η βαθμολογία είναι ίση τότε δεν παίρνει κανένας.
 *
 * Επιστρέφει πίνακα με 2 θέσεις (πόντοι Alice, πόντοι Bob)
 */

public class CompareTriplets {

    public static void main(String[] args) {
        int[] alice = {5, 6, 7};
        int[] bob = {3, 6, 10};
        int[] points;

        points = compareTriplets(alice, bob);

        System.out.println("Alice points: " + points[0] + ", Bob points: " + points[1]);
    }

    public static int[] compareTriplets(int[] a, int[] b){
        int[] points = new int[2];

        for (int i = 0; i < a.length; i++){
            if (a[i] > b [i]) points[0]++;
            else if (a[i] < b[i]) points[i]++;
        }
        return points;
    }
}
