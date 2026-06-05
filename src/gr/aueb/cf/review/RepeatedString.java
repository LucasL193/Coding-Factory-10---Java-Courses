package gr.aueb.cf.review;

/**
 * Δοθέντος ενός string, επιστρέφει ένα string
 * που αποτελεί απανάληψη του αρχικού string, n φορές.
 *
 * Για παράδειγμα αν το αρχικό string είναι το abc και το n = 3,
 * τότε επιστρέφει abcabcabc.
 */

public class RepeatedString {

    public static void main(String[] args) {
        String s = "abc";
        int n = 3;
        String result;

        result = repeat(n, s);
        System.out.println(result);
    }

    public static String repeat(int n, String str) {

        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }

        StringBuilder sb = new StringBuilder(str.length() + n);
        sb.repeat(str, n);
        return sb.toString();
    }
}
