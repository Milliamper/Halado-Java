package hu.meiit.haladojava;

import java.util.List;

public interface CourseRepository {

    List<CourseDTO> findByTeacher(Long teacherId);
    int getElementCount(Long teacherId);

}
