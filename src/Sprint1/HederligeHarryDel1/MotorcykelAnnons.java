package Sprint1.HederligeHarryDel1;

public class MotorcykelAnnons extends FordonsAnnons{
    private int motorvolym;
    private String drivtyp;

    public MotorcykelAnnons(int pris, int årsmodell, int antalMil, String rubrik, String beskrivning, int motorvolym, String drivtyp) {
        super(pris, årsmodell, antalMil, rubrik, beskrivning);
        this.motorvolym = motorvolym;
        this.drivtyp = drivtyp;
    }

    public String getAnnonsText() {
        return (super.getAnnonsText() + " Motorvolymen är på " + this.motorvolym + "cm³. " + "Motorcykelns drivtyp är " + this.drivtyp + ".");
    }
}
