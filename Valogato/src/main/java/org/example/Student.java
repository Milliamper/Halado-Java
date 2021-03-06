package org.example;

import org.w3c.dom.ls.LSOutput;

public class Student implements PersonChecker {

    private String name;
    private int age;
    private int cheatNumber;
    private float average;

    public static double GOOD_AVERAGE = 4.0;

    public Student(String name, int age, int cheatNumber, float average) {
        this.name = name;
        this.age = age;
        this.cheatNumber = cheatNumber;
        this.average = average;
    }

    @Override
    public boolean isOk() {
        return average > GOOD_AVERAGE && cheatNumber == 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cheatNumber=" + cheatNumber +
                ", average=" + average +
                '}';
    }


}
