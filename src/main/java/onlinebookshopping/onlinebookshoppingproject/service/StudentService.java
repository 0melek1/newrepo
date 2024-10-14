package onlinebookshopping.onlinebookshoppingproject.service;

import onlinebookshopping.onlinebookshoppingproject.model.Student;
import onlinebookshopping.onlinebookshoppingproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student registerStudent(Student student) {
        // Registration logic
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
