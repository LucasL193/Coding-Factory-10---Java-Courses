package gr.aueb.cf.ch3;

/**
 * Special cases of While
 * Zero iteration
 * One iteration
 * Eternal loop
 */

public class WhileSpecialCases {
    public static void main(String[] args) {
        int i = 1;

        //1. Zero iteration
        while (i <= 0){
            System.out.println("i = " + i);
            i++;
        }

        //2. One iteration
        while (i <= 1) {
            System.out.println("i = " + i);
            i++;
        }

        //3. eternal loop
        while(true){
            System.out.println("I'm in an eternal loop Help!");
        }

    }
}
