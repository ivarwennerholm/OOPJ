package Sprint4.Uppgift_5A.Server;

public class Kompis {
    String namn;
    String nummer;

    public Kompis(String namn, String nummer) {
        this.namn = namn;
        this.nummer = nummer;
    }
    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    @Override
    public String toString () {
        return ("Namn: " + this.namn + ", nummmer: " + this.nummer);
    }
}
