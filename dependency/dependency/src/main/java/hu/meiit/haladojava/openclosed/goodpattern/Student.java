package hu.meiit.haladojava.openclosed.goodpattern;

public class Student extends User{
    @Override
    public String getDashboard() {
            return "courseSubscriber, takeExam, listCourses";
    }
}
