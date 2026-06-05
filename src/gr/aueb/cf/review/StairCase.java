package gr.aueb.cf.review;

public class StairCase {

    public static void main(String[] args) {
        printStair(5);
    }

    public static void printStair(int n) {
        for (int i = 0; i <= n; i++){
            for (int j = 0; j<=n; j++){
                if (j >= i) {
                    System.out.print("");
                }
                else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}

