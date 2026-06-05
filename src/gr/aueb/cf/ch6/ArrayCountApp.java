package gr.aueb.cf.ch6;

/**
 * Μετράει το πλήθος των εμφανίσεων ενός ακεραίου
 * μέσα σε ένα πίνακα ακεραίων.
 */

public class ArrayCountApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 4, 5, 6, 7, 8, 9, 10};
        int value = 7;
        int result = getCount (arr, value);
        System.out.println (result);
    }

    public static int getCount(int[] arr, int value){
        if (arr == null) return -1;
        int count = 0;
        for (int item : arr ) {

            if (item == value){
                count++;
            }

        }
        return count;
    }
}
