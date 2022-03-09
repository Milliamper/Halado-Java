package hu.meiit.haladojava;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.*;

public class TeacherServiceImplTest {

    @Test
    public void getMyStudents() {

        // GIVEN
        StudentRepository studentRepository = mock(StudentRepository.class);

        CourseRepository courseRepository = mock(CourseRepository.class);
        Long teacherId = 123L;

        List<CourseDTO> findByTeacherResult = new ArrayList<>();
        findByTeacherResult.add(new CourseDTO(1L, "Demo Course", new ArrayList<>()));

        List<StudentDTO> findByCourseIdResult = new ArrayList<>();
        findByCourseIdResult.add(new StudentDTO(1L, "Name One", "ASDF33"));
        findByCourseIdResult.add(new StudentDTO(2L, "Name Two", "OKND44"));
        findByCourseIdResult.add(new StudentDTO(3L, "Name Three", "LKNDS231"));

        when(studentRepository.findByCourseId(anyList())).thenReturn(findByCourseIdResult);
        when(courseRepository.findByTeacher(teacherId)).thenReturn(findByTeacherResult);

        TeacherServiceImpl teacher = new TeacherServiceImpl(studentRepository, courseRepository, teacherId);

        // WHEN
        List<StudentDTO> myStudents = teacher.getMyStudents();

        // THEN
        assertEquals(myStudents.size(), 3);

        verify(courseRepository, times(1)).findByTeacher(eq(teacherId));
        verify(studentRepository, times(1)).findByCourseId(anyList());

    }

    @Test
    public void shouldBeTooMuchCourse() {
        // GIVEN
        Long teacherId = 404L;
        int numberOfCourses = 123;

        CourseRepository courseRepository = mock(CourseRepository.class);
        when(courseRepository.getElementCount(teacherId)).thenReturn(1);

        StudentRepository studentRepository = mock(StudentRepository.class);

        TeacherServiceImpl teacher = new TeacherServiceImpl(studentRepository, courseRepository, teacherId);

        // WHEN THEN
        assertFalse(teacher.shouldBeTired());
    }

    @Test
    public void shouldBeTooMuchUsers() {
        // GIVEN
        Long teacherId = 404L;
        int numberOfUsers = 123;

        CourseRepository courseRepository = mock(CourseRepository.class);
        when(courseRepository.getElementCount(teacherId)).thenReturn(1);

        StudentRepository studentRepository = mock(StudentRepository.class);
        when(studentRepository.findByCourseId(anyList())).thenReturn(getStudentList11Item());

        TeacherServiceImpl teacher = new TeacherServiceImpl(studentRepository, courseRepository, teacherId);

        // WHEN THEN
        assertTrue(teacher.shouldBeTired());
    }

    private List<StudentDTO> getStudentList11Item() {
        List<StudentDTO> studentList = new ArrayList<>();
        for (long i = 0; i < 11; i++) {
            studentList.add(new StudentDTO(i, "Name " + i, "BDS" + i));
        }
        return studentList;
    }
}