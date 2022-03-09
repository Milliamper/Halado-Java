package hu.meiit.haladojava;

import java.util.List;

public interface TeacherService {
    List<StudentDTO> getMyStudents();

    boolean shouldBeTired();
}
