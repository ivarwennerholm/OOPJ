package Sprint1.ArvOchArrayer_3A;

public class Övningsuppgift3 {

    Övningsuppgift3() {
        Student ivar = new Student("Ivar");
        Student betty = new Student("Betty");
        Student janos = new Student("Janos");
        Lärare sigrun = new Lärare("Sigrun");
        Kurs oopj = new Kurs("Objektorientering och Java");

        ivar.läggTillKurs(oopj);
        betty.läggTillKurs(oopj);
        janos.läggTillKurs(oopj);
        oopj.läggTillStudent(ivar);
        oopj.läggTillStudent(betty);
        oopj.läggTillStudent(janos);
        oopj.läggTillLärare(sigrun);
        sigrun.läggTillKurs(oopj);
        printKurs(oopj);
        printKurserFörStudent(ivar);
        printKurserFörLärare(sigrun);

    }

    public void printKurs(Kurs kurs) {
        System.out.println("Kurs: " + kurs.getNamn());
        System.out.println("Lärare: " + kurs.getLärare().getNamn());

        for (Student s : kurs.getStudenter()) {
            if (s != null)
                System.out.println("Student: " + s.getNamn());
        }

    }
    public void printKurserFörStudent(Student student) {
        System.out.println("Student: " + student.getNamn());

        for (Kurs k : student.getKurser()) {
            if (k != null)
                System.out.println("Kurs: " + k.getNamn());
        }
    }

    public void printKurserFörLärare(Lärare lärare) {
        System.out.println("Lärare: " + lärare.getNamn());

        for (Kurs k : lärare.getKurser()) {
            if (k != null)
                System.out.println("Kurs: " + k.getNamn());
        }
    }

    public static void main(String[] args) {
        Övningsuppgift3 övn3 = new Övningsuppgift3();
    }

}
