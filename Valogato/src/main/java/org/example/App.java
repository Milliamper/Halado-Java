package org.example;

public class App 
{

    private static void printGoodUniversityCitizens(PersonChecker[] citizens){
        for (PersonChecker citizen : citizens) {
            if (citizen.isOk()){
                System.out.println(citizen);
            }
        }
    }

    public static void main( String[] args )
    {
        PersonChecker[] citizens = new PersonChecker[6];

        citizens[0] = new Student("student1", 22, 2, 3.4F);
        citizens[1] = new Teacher("teacher1", 22, 120);
        citizens[2] = new Student("student2", 22, 0, 4.5F);
        citizens[3] = new Student("student3", 22, 3, 5F);
        citizens[4] = new Teacher("teacher2", 22, 20);
        citizens[5] = new Student("student4", 22, 2, 3.4F);

        printGoodUniversityCitizens(citizens);
        System.out.println( "Hello World!" );
    }
}
