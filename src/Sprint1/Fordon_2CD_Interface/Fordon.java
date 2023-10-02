package Sprint1.Fordon_2CD_Interface;

public class Fordon implements Printable, Hjulburen {
    private int hastighet;
    private int vikt;

    protected Fordon() {
        hastighet = 0;
    }

    protected Fordon(int vikt) {
        this.vikt = vikt;
        hastighet = 0;
    }

    public int getHastighet() {
        return hastighet;
    }

    public void ändraHastighet(int hastighet) {
        this.hastighet = hastighet;
    }

    public int getVikt() {
        return vikt;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }

    protected String whoAmI() {
        return "Fordon";
    }

    @Override
    public String printMe() {
        return (this.whoAmI() + "\n" +
                "Vikt: " + this.vikt + "\n" +
                "Hastighet: " + this.hastighet + "\n");
    }

    @Override
    public int getAntalHjul() {
        return 0;
    }
}
