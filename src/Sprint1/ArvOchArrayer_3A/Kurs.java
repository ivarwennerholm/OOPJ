package Sprint1.ArvOchArrayer_3A;

public class Kurs {
    private String namn;
    private Lärare lärare;
    private Student[] studenter;

    private int studentCounter = 0;

    public Kurs() {
        studenter = new Student[10];
    }

    public Kurs(String namn) {
        this.namn = namn;
        studenter = new Student[10];
    }

    public Kurs(String namn, Lärare lärare) {
        this.namn = namn;
        this.lärare = lärare;
        studenter = new Student[10];
    }

    public String getNamn() {
        return namn;
    }

    public Lärare getLärare() {
        return lärare;
    }

    public void läggTillLärare(Lärare lärare) {
        this.lärare = lärare;
        System.out.println("Kursen " + this.namn + " har nu " + lärare.getNamn() + " som lärare");
    }

    public void läggTillStudent(Student student) {
        studenter[studentCounter++] = student;
        System.out.println("Kursen " + this.namn + " har nu " + student.getNamn() + " som elev");
    }

    public Student[] getStudenter() {
        return studenter;
    }
}
