package Sprint1.ArvOchArrayer_3A;

public class Student extends Person {
    private Kurs [] deltarI;

    private int kursCounter = 0;

    public Student(String namn) {
        super(namn);
        deltarI = new Kurs[10];

    }

    public void läggTillKurs(Kurs kurs) {
        deltarI[kursCounter++] = kurs;
        System.out.println(this.getNamn() + " är nu inskriven på kursen " + kurs.getNamn());
    }

    public Kurs[] getKurser(){
        return deltarI;
    }
}
