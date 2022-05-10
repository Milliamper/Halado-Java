package hu.meiit.haladojava.lambda;

public class UserDTO {

    private String name;
    private int age;

    public UserDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UserDTO(User user) {
        this.name = user.getName();
        this.age = user.getAge();
    }
}
