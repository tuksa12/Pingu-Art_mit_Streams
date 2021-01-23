package pgdp.pinguart;

import static pgdp.MiniJava.readInt;

import java.util.stream.Stream;

public class PinguArt {

    public static void main(String[] args) {
        String inputMessage = "Bitte geben Sie eine Pingu-Art-Zahl ein:";

        Stream.generate(() -> readInt(inputMessage)).limit(8).forEach(System.out::println);
    }
}
