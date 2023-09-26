package Sprint1.HederligeHarryDel1;

public class FordonsAnnons {
    private int pris, årsmodell, antalMil;
    private String rubrik, beskrivning;

    public FordonsAnnons() {}
    public FordonsAnnons(int pris, int årsmodell, int antalMil, String rubrik, String beskrivning){
        this.pris = pris;
        this.årsmodell = årsmodell;
        this.antalMil = antalMil;
        this.rubrik = rubrik;
        this.beskrivning = beskrivning;
    }

    public String getAnnonsText() {
        return (this.rubrik + " av " + årsmodell + " års modell. " + "Gått " + this.antalMil + " mil, och kostar " + this.pris + " kr. " + this.beskrivning);
    }
}
