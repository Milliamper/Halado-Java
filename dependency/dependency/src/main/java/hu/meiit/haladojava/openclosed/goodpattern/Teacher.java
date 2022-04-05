package hu.meiit.haladojava.openclosed.goodpattern;

public class Teacher extends User{

    @Override
    public String getDashboard() {
        return "coursePublischer, createExam, listCoursess";
    }
}
