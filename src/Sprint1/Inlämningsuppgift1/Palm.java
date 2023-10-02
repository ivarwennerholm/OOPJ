package Sprint1.Inlämningsuppgift1;

public class Palm extends Växt implements Skrivbar {

    final private String näringstyp = "kranvatten";
    private String namn;
    private double längd, näringsBehov;

    public Palm(double längd, String namn) {
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
        this.setNäringsBehov();
    }

    public double getLängd() {
        return this.längd;
    }

    public double getNäringsBehov() {
        return this.näringsBehov;
    }

    public void setNäringsBehov() {
        this.näringsBehov = (0.5 * this.längd);
    }

    public String getNäringsTyp() {
        return näringstyp;
    }

    public String skrivMenu() {
        return ("Palmen " + "\"" + this.namn + "\"");
    }

    public String skrivAllInfo() {
        return ("Palmen " + "\"" + this.namn + "\" behöver " +
                this.näringsBehov + " liter " + this.näringstyp + " per dag.");
    }
}