package gr.aueb.cf.review;

/**
 * Από ένα σημείο x, φτάνει η ξεπερνάει ένα σημείο y, όπου κάθε jump
 * έχει μήκος jmp
  */

public class FrogJumps {

    public static void main(String[] args) {

    }

    public static int countJumps(int x, int y, int jumpLength) {
        int count = 0;

        while (x < y) {
            x += jumpLength;
            count ++;
        }

        return count;
    }

    public static int countJumps2(int x, int y, int jumpLength) {
        return (int) Math.ceil((double)(y - x) / jumpLength);
    }
}
