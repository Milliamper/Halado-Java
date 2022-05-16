package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // A collection típusparaméterrel rendelkezik
        Collection<String> myCol = new ArrayList<>();



        // ilyenkor kiolvasáskor mindig meg kell nézni, hogy mi van benne
        List<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add(5);

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("peach");
        fruits.add("apple");

        for(String fruit:fruits) {
            System.out.println(fruit);
        }

        Collections.sort(fruits);

        // A Map-nél a kulcsnak és az értéknek is van egy típusa, 2 típusparaméterrel rendelkezik
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("peach", 3);

        //kulcs lekérdezése
        System.out.println(myMap.get("apple"));


    }
}
