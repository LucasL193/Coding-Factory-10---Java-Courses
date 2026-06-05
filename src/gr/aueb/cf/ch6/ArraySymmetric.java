package gr.aueb.cf.ch6;

/**
 * [1, 2, 3, 3, 2, 1] είναι συμμετρικός πίνακας
 * [1, 2, 3, 2, 1] είναι συμετρικός
 */

public class ArraySymmetric {

    public static void main(String[] args) {

    }

    public static boolean isArraySymmetric(int[] arr){
        if (arr == null) return false;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]){
                return false;
            }
        }

        return true;
    }
}
