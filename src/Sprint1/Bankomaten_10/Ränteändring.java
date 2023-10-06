package Sprint1.Bankomaten_10;

public class Ränteändring {
    double nyRänta;
    Personal beviljatAv;

    Ränteändring(double nyRänta, Personal beviljatAv) {
        this.nyRänta = nyRänta;
        this.beviljatAv = beviljatAv;
    }

    double getNyRänta() {
        return nyRänta;
    }

    void setNyRänta(double nyRänta) {
        this.nyRänta = nyRänta;
    }

    Personal getBeviljatAv() {
        return beviljatAv;
    }

    void setBeviljatAv(Personal beviljatAv) {
        this.beviljatAv = beviljatAv;
    }
}
