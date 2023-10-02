package Sprint1.ArvOchArrayer_3A;

public class Lärare extends Person {

    private Kurs[] kurser;
    private int kursCounter = 0;

    public Lärare (String namn) {
        super(namn);
        kurser = new Kurs[10];
    }

    public void läggTillKurs(Kurs kurs) {
        kurser[kursCounter++] = kurs;
        System.out.println(this.getNamn() + " är nu registrerad som lärare på kursen " + kurs.getNamn());
    }

    public Kurs[] getKurser() {
        return kurser;
    }

}
