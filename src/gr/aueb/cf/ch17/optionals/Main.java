package gr.aueb.cf.ch17.optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) throws Exception{
        Optional<String> optional = Optional.of("Hello");
        Optional<String> empty = Optional.empty();
        Optional<String> opt = Optional.ofNullable("Coding"); // safe

        // isPresent - isEmpty
        if (opt.isPresent()) {
        //if (!opt.isEmpty()) {
            System.out.println(opt.get());
        } else {
            System.out.println("Not Found");
        }

        String s = opt.orElse("Default");

        String s1 = opt.orElseThrow(() -> new Exception("Not found"));
    }
}
