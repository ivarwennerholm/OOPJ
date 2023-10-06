package Sprint1.Bankomaten_10;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Kund {
    private String namn;
    private ArrayList<Konto> konton = new ArrayList<>();
    private ArrayList<Lån> lån = new ArrayList<>();

    Kund(String namn) {
        this.namn = namn;
    }

    void nyttKonto(int saldo, double räntesats) {
        konton.add(new Konto(saldo, räntesats));
    }

    void nyttKonto(double räntesats) {
        konton.add(new Konto(räntesats));
    }

    void nyttLån(int belopp, double räntesats, Personal beviljatAv) {
        lån.add(new Lån(belopp, räntesats, beviljatAv));
    }

    void listaKonton() {
        int counter = 1;
        System.out.println(this.namn + "s konton:");
        for (Konto k : konton) {
            System.out.println("Konto " + counter + ":\n" +
                    "Saldo: " + k.getSaldo() + "\n" +
                    "Räntesats: " + k.getRäntesats() + "\n");
            counter++;
        }
    }

    void listaLån() {
        int counter = 1;
        System.out.println(this.namn + "s lån:");
        for (Lån l : lån) {
            System.out.println("Lån " + counter + ":\n" +
                    "Belopp: " + l.getBelopp() + "\n" +
                    "Räntesats: " + l.getRäntesats() + "\n" +
                    "Beviljat av: " + l.getBeviljatAv().getNamn() + "\n");
            counter++;
        }
    }

    String getNamn() {
        return namn;
    }

    void setNamn(String namn) {
        this.namn = namn;
    }

    Lån getLån(int nummer) {
        return this.lån.get(nummer - 1);
    }
}