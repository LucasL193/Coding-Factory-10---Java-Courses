package gr.aueb.cf.ch13;

public class Point {
    private int x;
    private int y;

    private Point() {

    }

    /**
     * Static factory method.
     *
     * @return
     */

    public static Point getInstance() {
        return new Point();
    }

}

