package gr.aueb.cf.ch5;

/**
 * Ορίζει μία μέθοδο void swap (int a, int b)
 * η οποία έχει στόχο να ανταλλάζει αμοιβαία τις τιμές
 * των a, b, δηλδή το a -> b και το b -> a.
 */

public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("Πριν το swap a = %d, b = %d\n ", a, b);

        swap(a, b);

        System.out.printf("Μετά το swap a = %d, b = %d\n ", a, b);
    }

    /**
     * Swaps the values of a and b.
     * @param a the first int to swap
     * @param b the second int to swap
     */
    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }

}
