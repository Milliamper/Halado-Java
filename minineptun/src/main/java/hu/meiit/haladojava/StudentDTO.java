package hu.meiit.haladojava;

public class StudentDTO {
    private Long id;
    private String name;
    private String neptunCode;

    public StudentDTO(Long id, String name, String neptunCode) {
        this.id = id;
        this.name = name;
        this.neptunCode = neptunCode;
    }

    public StudentDTO() {
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

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }
}
