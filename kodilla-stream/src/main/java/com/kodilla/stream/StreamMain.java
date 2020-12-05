package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;




public class StreamMain {
    public static void main(String[] args) {
    //Zadanie 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("PIERWSZY", String::toLowerCase);
        poemBeautifier.beautify("drugi", String::toUpperCase);
        poemBeautifier.beautify("Trzeci",(text)->"*** "+text +" ***");
        poemBeautifier.beautify("Czwarty",(text)->text.substring(1,text.length()-1));
        poemBeautifier.beautify("AAAPiątyAAA",(text)->text.replace("A",""));

        System.out.println();
    }

}






