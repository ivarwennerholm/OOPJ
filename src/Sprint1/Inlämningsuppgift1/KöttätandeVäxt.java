package Sprint1.Inlämningsuppgift1;

public class KöttätandeVäxt extends Växt implements Skrivbar {

    final private String näringstyp = "proteindryck";
    private String namn;
    private double längd, näringsBehov;

    public KöttätandeVäxt(double längd, String namn) {
        this.längd = längd;
        this.namn = namn;
        this.setNäringsBehov();
    }

    public void setLängd(double längd) {
        this.längd = längd;
        this.setNäringsBehov();
    }

    public double getLängd() {
        return this.längd;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getNamn() {
        return this.namn;
    }

    public void setNäringsBehov() {
        this.näringsBehov = (0.1 + 0.2 * this.längd);
    }

    public double getNäringsBehov() {
        return this.näringsBehov;
    }

    public String getNäringsTyp() {
        return this.näringstyp;
    }

    public String skrivMenu() {
        return ("Köttätande växten " + "\"" + this.namn + "\"");
    }

    public String skrivAllInfo() {
        return ("Köttätande växten " + "\"" + this.namn + "\" behöver " +
                this.näringsBehov + " liter " + this.näringstyp + " per dag.");
    }
}
