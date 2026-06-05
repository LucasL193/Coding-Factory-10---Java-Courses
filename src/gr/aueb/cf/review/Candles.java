package gr.aueb.cf.review;

/**
 * Δίνεται ένας πίνακας με τα ύψη κεριών
 * Μετρήστε πόσα κεριά έχουν το μέγιστο ύψος.
 */

public class Candles {

    public static void main(String[] args) {
        int[] candles = {4, 4, 1, 3, 4, 4, 4,};
    }

    public static int candlesCount(int[] arr) {
        int max = arr[0];
        int count = 0;

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int el : arr) {
            if (el == max) count++;
        }

        return count;

    }


}
