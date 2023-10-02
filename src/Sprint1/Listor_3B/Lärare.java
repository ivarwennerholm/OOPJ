package Sprint1.Listor_3B;
import java.util.ArrayList;
import java.util.List;

public class Lärare extends Person {

    private List<Kurs> kurser;
    public Lärare (String namn) {
        super(namn);
        kurser = new ArrayList<>();
    }

    public void läggTillKurs(Kurs kurs) {
        kurser.add(kurs);
        System.out.println(this.getNamn() + " är nu registrerad som lärare på kursen " + kurs.getNamn());
    }

    public List<Kurs> getKurser() {
        return kurser;
    }

}
