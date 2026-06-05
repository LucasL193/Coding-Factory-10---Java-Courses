package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει οριζόντια, κάθετα,
 * από 1 .. 10, από 10 .. 1,
 * 10 χ 10 αστεράκια
 */

public class Stars {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.print("*");
        }

        for (int i = 1; i <= 10; i++){
            System.out.println("*");
        }

        //10 γραμμές χ 10 αστεράκια η κάθε γραμμή

        for (int i = 1; i <= 10; i++){

            for (int j = 1; j <= 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //1η γραμμή 1, 2η γραμμή 2, 3..., 10η 10 αστεράκια
        for (int i = 0; i <= 10; i++){

            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //1η γραμμή 10, 2η 9, 3η 8, ... , 10η 1
        for (int i = 0; i <= 10; i++){

            for (int j = 10; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
