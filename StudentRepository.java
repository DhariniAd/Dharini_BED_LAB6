package www.gl.java.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import www.gl.java.student.util.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // Custom query to find students by course
    List<Student> findByCourse(String course);

    // Custom query using JPQL (Java Persistence Query Language)
    @Query("SELECT s FROM Student s WHERE s.country = :country")
    List<Student> findByCountry(@Param("country") String country);
}
