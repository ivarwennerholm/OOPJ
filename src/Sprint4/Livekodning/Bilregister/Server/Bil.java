package Sprint4.Livekodning.Bilregister.Server;

public class Bil {
private String regnummer;
private String färg;

String modell;
    public Bil() {}
    public Bil(String regnummer, String färg, String modell) {
        this.regnummer = regnummer;
        this.färg = färg;
        this.modell = modell;
    }

    public String getRegnummer() {
        return regnummer;
    }

    public void setRegnummer(String regnummer) {
        this.regnummer = regnummer;
    }

    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    @Override
    public String toString() {
        return ("Regnummer: " + this.regnummer + ", färg: " + this.färg + ", modell: " + this.modell);
    }

}
