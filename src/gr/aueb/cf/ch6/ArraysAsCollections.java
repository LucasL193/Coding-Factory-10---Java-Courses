package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Οι βασικές πράξεις σε συλλογές όπως οι πίνακες είναι:
 * filtering
 * mapping
 * reducing
 */

public class ArraysAsCollections {

    public static void main(String[] args) {

    }

    public static int[] filterEven(int[] arr){
        if (arr == null || arr.length == 0) return new int[0];
        int[] arrayToReturn = new int[arr.length];
        int count = 0;

        for (int element : arr) {
            if (element % 2 == 0){
                arrayToReturn[count++] = element;
            }
        }

        return Arrays.copyOf(arrayToReturn, count);
    }

    public static int[] mapToDouble(int[] arr){
        if (arr == null || arr.length == 0) return new int[0];
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            mapped[i] = arr[i] * 2;
        }

        return mapped;
    }

    public static int arraySum (int[] arr){
        if (arr == null || arr.length == 0) return 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }

    public static double avg(int[] arr){
        if (arr == null || arr.length == 0) return 0;
        int sum = arraySum(arr);
        return (double) sum / arr.length;
    }

    public static boolean anyEven(int[] arr){
        if (arr == null || arr.length == 0) return false;

        for (int element : arr){

            if (element % 2 == 0){
                return true;
            }
        }

        return false;
    }

    public static boolean allEven(int[] arr){
        if (arr == null || arr.length == 0) return false;

        for (int element : arr){

            if (element % 2 != 0){
                return false;
            }
        }

        return true;
    }

    public static boolean isMoreThanTwoEven(int[] arr){
        if (arr == null || arr.length == 0) return false;
        int count = 0;

        for (int element : arr){

            if (element % 2 == 0){
                count ++;
            }

            if (count > 2){
                return true;
            }
        }

        return false;
    }
}
