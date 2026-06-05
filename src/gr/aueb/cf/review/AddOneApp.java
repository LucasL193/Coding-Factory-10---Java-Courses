package gr.aueb.cf.review;

/**
 * Έστω ότι θέλουμε να αναπαριστούμε μεγάλους ακεραίους
 * σε μορφή πίνακα. Θέλουμε να προσθέσουμε τη μονάδα.
 */

public class AddOneApp {

    public static void main(String[] args) {

    }

    public static int[] addOne(int[] arr) {
        int[] arrOut = new int[arr.length + 1];
        int sum = 0;
        int carry = 1;

        for (int i = arr.length - 1; i >= 0; i--){
            sum = arr[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 1) {
            arrOut[0] = 1;
        }

        return arrOut;
    }
}
