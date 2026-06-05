package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ορίζει δύο μεθόδους, τις isEven και isOdd
 * για τον έλεγχο ενός ακεραίου αν είναι άρτιος ή περιττός.
 */

public class EvenOddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        number = scanner.nextInt();

        isEven(number);

        isOdd(number);


    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        // return num % 2 != 0;
        return !isEven(num);
    }
}
