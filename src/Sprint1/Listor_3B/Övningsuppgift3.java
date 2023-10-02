package Sprint1.Listor_3B;

public class Övningsuppgift3 {

    Övningsuppgift3() {
        Student ivar = new Student("Ivar");
        Student betty = new Student("Betty");
        Student janos = new Student("Janos");
        Lärare sigrun = new Lärare("Sigrun");
        Kurs oopj = new Kurs("Objektorientering och Java");

        ivar.läggTillKurs(oopj);
        sigrun.läggTillKurs(oopj);
        oopj.läggTillLärare(sigrun);
        oopj.läggTillStudent(ivar);
        oopj.läggTillStudent(betty);
        oopj.läggTillStudent(janos);
        printKurserFörStudent(ivar);
        printKurserFörLärare(sigrun);
        printKurs(oopj);
    }

    public void printKurs(Kurs kurs) {
        System.out.println("Kurs: " + kurs.getNamn());
        System.out.println("Lärare: " + kurs.getLärare());
        for (int i = 0; i < kurs.getStudenter().size(); i++)
            System.out.println("Student: " + kurs.getStudenter().get(i).getNamn());
    }
    public void printKurserFörStudent(Student student) {
        System.out.println("Student: " + student.getNamn());
        for (int i = 0; i < student.getKurser().size(); i++)
            System.out.println("Kurs: " + student.getKurser().get(i).getNamn());
    }

    public void printKurserFörLärare(Lärare lärare) {
        System.out.println("Lärare: " + lärare.getNamn());
        for (int i = 0; i < lärare.getKurser().size(); i++)
            System.out.println("Kurs: " + lärare.getKurser().get(i).getNamn());
    }

    public static void main(String[] args) {
        Övningsuppgift3 övn3 = new Övningsuppgift3();
    }

}
