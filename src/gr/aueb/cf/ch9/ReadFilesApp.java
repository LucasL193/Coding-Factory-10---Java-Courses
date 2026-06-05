package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Διαβάζει ένα αρχείο κειμένουν και εμφανίζει το περιεχόμενο του στην κονσόλα
 */

public class ReadFilesApp {

    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("C:/Users/User/Desktop/Coding Factory Slides/temp txt files/temp1.txt");
        String context = Files.readString(filePath);
        System.out.println(context);


    }
}
