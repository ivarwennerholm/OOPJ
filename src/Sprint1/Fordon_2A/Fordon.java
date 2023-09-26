package Sprint1.Fordon_2A;

public class Fordon {
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
}
