package gr.aueb.cf.ch3;

/**
 * Εμφανίζει 10 οριζόντια αστεράκια
 * δηλαδή 1 αστεράκι 10 φορές.
 */

public class PrintStars10 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10){
            System.out.print("*");
            i++;
        }

        while (i >= 1){
            System.out.print("*");
            i--;
        }
    }
}
