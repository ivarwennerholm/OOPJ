package Sprint1.Listor_3B;
import java.util.ArrayList;
import java.util.List;

public class Kurs {
    private String namn;
    private Lärare lärare;
    private List<Student> studenter;

    public Kurs(String namn) {
        this.namn = namn;
        studenter = new ArrayList<>();
    }

    public String getNamn() {
        return namn;
    }

    public String getLärare() {
        return lärare.getNamn();
    }

    public void läggTillLärare(Lärare lärare) {
        this.lärare = lärare;
        System.out.println("Kursen " + this.namn + " har nu " + lärare.getNamn() + " som lärare");
    }

    public void läggTillStudent(Student student) {
        studenter.add(student);
        System.out.println("Kursen " + this.namn + " har nu " + student.getNamn() + " som elev");
    }

    public List<Student> getStudenter() {
        return studenter;
    }
}
