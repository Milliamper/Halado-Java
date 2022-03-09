package hu.meiit.haladojava;

import java.util.List;

public interface TeacherController {
    List<CourseDTO> getAllCourseWithStudents(Long TeacherId);
}
