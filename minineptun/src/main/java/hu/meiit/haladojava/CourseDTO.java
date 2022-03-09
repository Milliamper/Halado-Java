package hu.meiit.haladojava;

import java.util.List;

public class CourseDTO {
    private Long id;
    private String name;
    private List<StudentDTO> studentList;

    public CourseDTO(Long id, String name, List<StudentDTO> studentList) {
        this.id = id;
        this.name = name;
        this.studentList = studentList;
    }

    public CourseDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentDTO> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentDTO> studentList) {
        this.studentList = studentList;
    }
}
