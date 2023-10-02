package Sprint1.Inlämningsuppgift1;

public class Kaktus extends Växt implements Skrivbar {
    final private String näringstyp = "mineralvatten";
    final private double näringsBehov = 0.2;
    private String namn;
    private double längd;

    public Kaktus(double längd, String namn) {
        this.längd = längd;
        this.namn = namn;
        this.setNäringsBehov();
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getNamn() {
        return this.namn;
    }

    public void setLängd(double längd) {
        this.längd = längd;
    }

    public double getLängd() {
        return this.längd;
    }

    public void setNäringsBehov() {
    }

    public double getNäringsBehov() {
        return this.näringsBehov;
    }

    public String getNäringsTyp() {
        return näringstyp;
    }

    public String skrivMenu() {
        return ("Kaktusen " + "\"" + this.namn + "\"");
    }

    public String skrivAllInfo() {
        return ("Kaktusen " + "\"" + this.namn + "\" behöver " +
                this.näringsBehov + " liter " + this.näringstyp + " per dag.");
    }
}
