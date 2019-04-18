package ac.za.cput.project.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"ac.za.cput.project.persistence"})
@EntityScan(basePackages = {"ac.za.cput.project.domain"})
@ComponentScan(basePackages = {"ac.za.cput.project.persistence"})
public class StudentApplication {

    public static void main(String [] args){
        SpringApplication.run(StudentApplication.class);
    }
}
