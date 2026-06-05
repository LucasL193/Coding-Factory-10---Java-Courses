package gr.aueb.cf.ch7;

/**
 * Δημιοργήστε μία μέθοδο που να παίρνει ως είσοδο ένα
 * string και ένα char και να επιστρέφει το πλήθος των εμφανίσεων
 * του char στο string.
 */

public class LetterCount {

    public static void main(String[] args) {

    }

    public static int letterCount(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
