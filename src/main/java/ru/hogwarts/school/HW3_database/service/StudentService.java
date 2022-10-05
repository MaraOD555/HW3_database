package ru.hogwarts.school.HW3_database.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.HW3_database.model.Student;
import ru.hogwarts.school.HW3_database.repository.StudentRepository;

import java.util.Collection;

@Service
public class StudentService {
    private final StudentRepository studentRepository; // инжектим интерфейс репозитория, т.к. данные теперь хранятся в БД
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student createStudent(Student student) {
      return studentRepository.save(student);
    }
    public Student findStudent(long id) {
        return studentRepository.findById(id).get();
    }
    public Student editStudent(Student student) {
       return studentRepository.save(student);
    }
    public void deleteStudents(long id){
        studentRepository.deleteById(id);
    }

    public Collection<Student> findByAge(int age) {
        return studentRepository.findByAge(age); //метод формируется в репозитории
    }
}

