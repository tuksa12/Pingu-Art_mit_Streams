package pgdp.pinguart;

import static pgdp.MiniJava.readInt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PinguArt {

    public static void main(String[] args) {
        String inputMessage = "Bitte geben Sie eine Pingu-Art-Zahl ein:";
        //Stream.generate(() -> readInt(inputMessage)).limit(8).forEach(System.out::println);

        ArrayList<String> inputAsNumbers = new ArrayList();
        ArrayList<String> inputAsString = new ArrayList();
        ArrayList<String> result = new ArrayList();

         Stream.generate(() -> readInt(inputMessage)).limit(8).forEach(number -> inputAsNumbers.add(number.toString()));

         inputAsNumbers.stream().forEach(x-> {
             while (x.length()<8){
                 x ="0" + x ;
             }
             inputAsString.add(x);
         });
         inputAsString.stream().forEach(string -> {
             int index = 7;
             String art = "";
             while (index >= 0){
                 if(string.charAt(index) == '0'){
                     art += " ";
                 } else if(string.charAt(index) == '1'){
                     art += "-";
                 } else if(string.charAt(index) == '2'){
                     art += "~";
                 } else if(string.charAt(index) == '3'){
                     art += "P";
                 }
                 index--;
             }
             result.add(art);
         });
        System.out.print("+---[PinguArt]---+"+"\n|"+result.get(0)
                + result.get(1) + "|\n"
                +"|" +result.get(2)
                +result.get(3) + "|\n"
                +"|" +result.get(4)
                +result.get(5) + "|\n"
                +"|" +result.get(6)
                +result.get(7) + "|\n"
                +"+----------------+");
    }
}
