package Sprint1.HederligeHarryDel1;

public class HusvagnsAnnons extends FordonsAnnons {
    private boolean dusch;
    private int antalBäddar;

    private String generateDuschText() {
        String duschText;
        if (dusch)
            duschText = " Husvagnen har dusch och ";
        else
            duschText = " Husvagnen saknar dusch, och har ";
        return duschText;
    }

    public HusvagnsAnnons(int pris, int årsmodell, int antalMil, String rubrik, String beskrivning, boolean dusch, int antalBäddar) {
        super(pris, årsmodell, antalMil, rubrik, beskrivning);
        this.dusch = dusch;
        this.antalBäddar = antalBäddar;
    }

    public String getAnnonstext() {
        return (super.getAnnonsText() + this.generateDuschText() + this.antalBäddar + "st sängplatser.");
    }
}
