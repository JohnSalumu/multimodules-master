package ac.za.cput.project.web;


import ac.za.cput.project.domain.Student;
import ac.za.cput.project.persistence.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private StudentRepository studentRepository;


    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public List<Student> getStudents(){

        List<Student> students = this.studentRepository.findAll();
        return students;
    }
}
