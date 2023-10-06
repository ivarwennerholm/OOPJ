package Sprint1.Bankomaten_10;
import java.util.ArrayList;

public class Lån {
    private int belopp;
    private double räntesats;
    private Personal beviljatAv;
    private ArrayList<Ränteändring> ränteändringar = new ArrayList<>();

    Lån(int belopp, double räntesats, Personal beviljatAv) {
        this.belopp = belopp;
        this.räntesats = räntesats;
        this.beviljatAv = beviljatAv;
    }

    void listaRänteändringar() {
        System.out.println("Ränteändringar:");
        for (int i = ränteändringar.size() - 1; i >= 0; i--) {
            System.out.println("Ny ränta " + ränteändringar.get(i).getNyRänta() +
                    ", beviljad av " + ränteändringar.get(i).getBeviljatAv().getNamn());
        }
        System.out.println();
    }

    int getBelopp() {
        return belopp;
    }

    void setBelopp(int belopp) {
        this.belopp = belopp;
    }

    double getRäntesats() {
        return räntesats;
    }

    void setRäntesats(double räntesats, Personal beviljatAv) {
        this.räntesats = räntesats;
        ränteändringar.add(new Ränteändring(räntesats, beviljatAv));
    }

    Personal getBeviljatAv() {
        return beviljatAv;
    }

    void setBeviljatAv(Personal beviljatAv) {
        this.beviljatAv = beviljatAv;
    }
}
