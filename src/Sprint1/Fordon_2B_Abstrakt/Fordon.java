package Sprint1.Fordon_2B_Abstrakt;

abstract public class Fordon {
    private int hastighet;
    private int vikt;

    protected Fordon() {
        hastighet = 0;
    }

    protected Fordon(int vikt) {
        this.vikt = vikt;
        hastighet = 0;
    }

    abstract void printMe();

    public int getHastighet() {
        return hastighet;
    }

    public int getVikt() {
        return vikt;
    }

    public void setHastighet(int hastighet) {
        this.hastighet = hastighet;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }
}