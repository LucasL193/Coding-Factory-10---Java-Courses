package gr.aueb.cf.ch5;

/**
 * Υπολογίζει την δύναμη με recursive
 */

public class PowerRecursive {

    public static void main(String[] args) {
        int base = 2;
        int power = 6;
        int result = pow(base, power);

        System.out.println(result);
    }

    public static int pow(int base, int power) {
        if (power == 0) return 1;
        return base * pow(base, power - 1);
    }
}
