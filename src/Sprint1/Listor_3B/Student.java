package Sprint1.Listor_3B;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Kurs> deltarI;

    public Student(String namn) {
        super(namn);
        deltarI = new ArrayList<>();
    }

    public void läggTillKurs(Kurs kurs) {
        deltarI.add(kurs);
        System.out.println(this.getNamn() + " är nu inskriven på kursen " + kurs.getNamn());
    }

    public List<Kurs> getKurser(){
        return deltarI;
    }
}
