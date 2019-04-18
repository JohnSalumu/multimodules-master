package ac.za.cput.project.persistence;


import ac.za.cput.project.domain.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DbChrist implements CommandLineRunner {

     private StudentRepository studentRepository;

    public DbChrist(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Student John = new Student (217011284,"John","Salumu",1,true);
        Student Christ = new Student(217025358,"Christ","Nganga",2,false);
        Student Isaac = new Student(216036655,"Isaac", "Ekofo", 3,true);

        List<Student> students = new ArrayList<>();
        students.add(John);
        students.add(Christ);
        students.add(Isaac);

        this.studentRepository.saveAll(students);



    }
}
