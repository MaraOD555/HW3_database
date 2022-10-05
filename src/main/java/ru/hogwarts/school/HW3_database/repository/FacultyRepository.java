package ru.hogwarts.school.HW3_database.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.HW3_database.model.Faculty;
import ru.hogwarts.school.HW3_database.model.Student;

import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    List<Faculty> findByColor(String color);
}
