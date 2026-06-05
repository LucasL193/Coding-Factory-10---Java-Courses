package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το άθροισμα των αριθμών από το 1 εώς το 10,
 * δηλαδή 1 + 2 + .... +10
 */

public class Sum10 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int j = 1;
        int mul = 1;

        while (i  <= 10){
            sum += i;
            i++;
        }

        while (j <= 10) {
            mul *= j;
            j++;
        }
        System.out.println(sum);
        System.out.println(mul);
    }
}

