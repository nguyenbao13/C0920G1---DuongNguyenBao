package s10_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_ly_demerging_su_dung_queue;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Student implements Comparable<Student> {
    private String name;
    private String gender;
    private String dateOfBirth;

    public Student() {
    }

    public Student(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int compareTo(Student o) {
        DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return f.parse(this.getDateOfBirth()).compareTo(f.parse(o.getDateOfBirth()));
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
