package Sprint1.HederligeHarryDel1;

public class BilAnnons extends FordonsAnnons {
    private boolean sommardäck, vinterdäck;
    private String färg;

    public BilAnnons(int pris, int årsmodell, int antalMil, String rubrik, String beskrivning, String färg, boolean sommardäck, boolean vinterdäck) {
        super(pris, årsmodell, antalMil, rubrik, beskrivning);
        this.färg = färg;
        this.sommardäck = sommardäck;
        this.vinterdäck = vinterdäck;
    }

    private String genereraDäckText() {
        String däckText;
        if (sommardäck && vinterdäck)
            däckText = "Både sommar- och vinterdäck ingår";
        else if (!sommardäck && vinterdäck)
            däckText = "Vinterdäck ingår.";
        else if (sommardäck && !vinterdäck)
            däckText = "Sommardäck ingår.";
        else
            däckText = "Inga däck ingår.";
        return däckText;
    }

    public String getAnnonstext() {
        return (super.getAnnonsText() + " Färgen är " + this.färg + ". " + this.genereraDäckText());
    }

}
