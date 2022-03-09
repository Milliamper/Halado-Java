package hu.meiit.haladojava;

import java.util.List;

public interface StudentRepository {

    List<StudentDTO> findByCourseId(List<Long> courseIdList);
}
