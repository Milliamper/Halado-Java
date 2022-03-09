package hu.meiit.haladojava;

import java.util.List;
import java.util.stream.Collectors;

public class TeacherServiceImpl implements TeacherService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public final int COURSE_NUMBER_LIMIT = 10;
    public final int STUDENT_NUMBER_LIMIT = 10;

    private final Long teacherId;

    public TeacherServiceImpl(StudentRepository studentRepository, CourseRepository courseRepository, Long teacherId) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.teacherId = teacherId;
    }

    @Override
    public List<StudentDTO> getMyStudents() {
        List<CourseDTO> courseListByTeacher = courseRepository.findByTeacher(teacherId);
        return studentRepository.findByCourseId(courseListByTeacher.stream().map(course -> course.getId()).collect(Collectors.toList()));
    }

    @Override
    public boolean shouldBeTired() {
        return courseRepository.getElementCount(teacherId) > COURSE_NUMBER_LIMIT || getMyStudents().size() > STUDENT_NUMBER_LIMIT;
    }
}
