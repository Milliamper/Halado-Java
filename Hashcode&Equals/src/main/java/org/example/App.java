package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    private int age;
    private String name;
    private String job;

    public App(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }


    @Override
    public String toString() {
        return "App{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Collection<App> person = new ArrayList<App>();
        person.add(new App(1, "E", "EE"));
        person.add(new App(1, "E", "EE"));
        person.add(new App(3, "C", "CC"));
        person.add(new App(4, "B", "BB"));
        person.add(new App(5, "A", "AA"));

//        for (App element: person) {
//            System.out.println(element);
//        }

        String x = "5";
        int y = 5;
        String z = String.valueOf(y);

//        System.out.println(x.hashCode());
//        System.out.println(z.hashCode());

        Collection<Integer> list1 = new ArrayList<>();
        Collection<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        int a = 1;
        int a2 = 1;

//        System.out.println( a == a2);
//        System.out.println(String.valueOf(a).equals(a2));

        System.out.println(list1.hashCode());
        System.out.println(list2.hashCode());
        System.out.println(list1 == list2); // memóriahely
        System.out.println(list1.equals(list2)); // objektum értéket hasonlít össze

//        System.out.println(x == y);
//        System.out.println(x.equals(y));
//        System.out.println(x.hashCode() == y.hashCode());
//        System.out.println(x.hashCode());
    }






}
