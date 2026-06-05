package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Αναζήτηση ενός στοιχείου σε έναν πίνακα
 */

public class ArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 0;
        int position = 0;

        System.out.println("Please insert a value to search for:");
        value = in.nextInt();

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value found at position: " + (position + 1));
        }

    }

    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;

        for (int i =0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public static int getPositionVer2(int[] arr, int value) {
        if (arr == null) return -1;
        int positionToReturn = -1;

        for (int i =0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }
}
