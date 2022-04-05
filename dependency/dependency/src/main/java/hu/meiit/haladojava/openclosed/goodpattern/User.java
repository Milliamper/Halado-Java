package hu.meiit.haladojava.openclosed.goodpattern;

public class User {
    private String role;

    public void login() {
        System.out.println("login");
    }
    public void logout() {
        System.out.println("logout");
    }
    public String getDashboard() {
        String dashboardContent;
        if("student".equals(this.role)) {
            dashboardContent = "courseSubscriber, takeExam, listCourses";
        } else {
            dashboardContent = "coursePublischer, createExam, listCourses";
        }
        return dashboardContent;
    }
}
