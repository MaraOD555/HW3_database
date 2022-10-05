package ru.hogwarts.school.HW3_database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.HW3_database.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> { //Spring ищет сущности по определенным полям
    List<Student> findByAge(int age);
}
