package ac.za.cput.project.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long studentID;
    private String name;
    private String lastName;
    private int classification;
    private boolean isRegistered;


    protected Student (){

    }

    public Student(long studentID, String name, String lastName, int classification, boolean isRegistered) {
        this.studentID = studentID;
        this.name = name;
        this.lastName = lastName;
        this.classification = classification;
        this.isRegistered = isRegistered;
    }

    public long getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getClassification() {
        return classification;
    }

    public boolean isRegistered() {
        return isRegistered;
    }
}
