package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Practice {


    public static void main(String[] args) {
//        System.out.println(filter().toString());
        filter(data()); // ha itt hívom meg a metódusokat, akkor csak egy helyen kell átnézni, nem 40 különbözőn
        System.out.println(filter(data()).toString());
        System.out.println(toLength(data()).toString());
        System.out.println(toUpperCase(filter(data())));
        System.out.println(toLength(filter(data())).toString());
        System.out.println(transformList(data(), String::toLowerCase)); // így általánosabb a megoldás, nincs rögzítve a művelet
        // kiveszi az első 3 karaktert
        System.out.println(transformList(data(), (input) -> input.substring(0,2)));

        // ez egy metódus referencia, ami egy művelet, és bárhol fel lehet használni ahol String String kell
        // olyan lokális változó ami műveletet tartalmaz
        Function<String, String> endOfString = (input) -> input.substring(input.length()-4, input.length()-1);
        System.out.println(transformList(data(), endOfString));
    }

    public static List<String> filter(List<String> input) {
        // végig megyek a listán és egy másikba beleteszem azokat amiknek a hossza > 3
        List<String> output = new ArrayList<>();
        for (String item : input) {
            if (item.length() > 4) {
                output.add(item);
            }
        }
        return output;
    }

//    public static List<String> filter() {
//        List<String> input = data(); // jobb lenne ha nem közvetlenül hívná meg
//        return input;
//    }

    public static List<String> data() {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Béla");
        nameList.add("Károly");
        nameList.add("Noémi");
        return nameList;
    }

    public static List<Integer> toLength(List<String> input) {
        List<Integer> output = new ArrayList<>();
        for (String item : input) {
            output.add(item.length());
        }
        return output;
    }

    public static List<String> toUpperCase(List<String> input) {
        List<String> output = new ArrayList<>();
        for (String item : input
        ) {
            output.add(item.toUpperCase());
        }
        return output;
    }

    public static List<String> toLowerCase(List<String> input) {
        List<String> output = new ArrayList<>();
        for (String item : input) {
            output.add(item.toLowerCase());
        }
        return output;
    }

    // toUpper/Lower case kicserélése implementációval, hogy rövidebb legyen a kód
    // A Function egy függvény referencia aminek kell a paraméter, meg a visszatérési érték típusa
    // Arra jó hogyha nem tudom hogy az osztály milyen típusú metódussal fog működni, de ettől még a kódot meg tudom írni
    public static List<String> transformList (List<String> input, Function<String, String> transformFunction) {
        List<String> output = new ArrayList<>();
        for (String item : input) {
            output.add(transformFunction.apply(item)); // így csak annyit tudok a fv-ről, hogy Stringet kap és azzal is tér vissza
        }
        return output;
    }

}
