package gr.aueb.cf.ch4;


/**
 * Υπολογίζει και εκτυπώνει το άθροισμα και το γινόμενο
 * των ακεραίων από 1 εως 10
 */

public class SumMulApp {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        for (int i = 1; i <= 10; i++){
            sum += i;
            mul *= i;
        }
        System.out.println("Το άθροισμα από το 1 μέχρι το 10 είναι: " + sum);
        System.out.println("Το γινόμενο από το 1 μέχρι το 10 είναι: " + mul);
    }

}
