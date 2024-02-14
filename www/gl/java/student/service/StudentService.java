package www.gl.java.student.service;

import www.gl.java.student.util.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    void saveOrUpdateStudent(Student student);
    void deleteStudent(Long id);
}
