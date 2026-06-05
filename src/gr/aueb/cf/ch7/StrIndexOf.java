package gr.aueb.cf.ch7;

public class StrIndexOf {
    public static void main(String[] args) {
        String s = "Coding Factory";

        int positionOfo = s.indexOf('o'); // 1
        int positionOfLasto = s.lastIndexOf('o'); // 11
    }

    // Μέθοδος που επιστρέφει την κατάληξη του ονόματος ενός αρχείου. π.χ. αν έχουν coding.txt επιστρέφει txt

    public static String fileType(String s){
        int dotPosition = s.lastIndexOf('.');
        return s.substring(dotPosition + 1);
    }
}
