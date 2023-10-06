package Sprint1.Bankomaten_10;

public class Konto {
    private int saldo;
    private double räntesats;

    public Konto(double räntesats) {
        this.räntesats = räntesats;
    }

    Konto(int saldo, double räntesats) {
        this.saldo = saldo;
        this.räntesats = räntesats;
    }

    int getSaldo() {
        return saldo;
    }

    void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    double getRäntesats() {
        return räntesats;
    }

    void setRäntesats(double räntesats) {
        this.räntesats = räntesats;
    }
}
