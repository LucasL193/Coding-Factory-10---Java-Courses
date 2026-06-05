package gr.aueb.cf.review;

/**
 * Ένας αριθμός Armstrong είναι ένας ακέραιος
 * αριθμός που είναι ίσος με το άθροισμα των ψηφίων του
 * όπου το κάθε ψηφίο έχει υψωθεί στην δύναμη του αριθμού των ψηφίων
 * Για παράδειγμα 153 = 1^3 + 5^3 + 3^3
 */

public class Armstrong {

    public static void main(String[] args) {

    }

    public static boolean isArmstrong(int num) {
        int numberOfDigits = 0;
        int temp = 0;
        int digit = 0;
        int sum = 0;

        temp = num;
        while (temp != 0) {
            numberOfDigits++;
            temp /=10;
        }

        temp = num;
        while (temp != 0) {
            digit = temp % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        return sum == num;

    }
}
