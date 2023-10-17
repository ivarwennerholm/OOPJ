package Sprint2.Övningsuppgift_12;

import java.io.Serializable;

public abstract class Fordon implements Serializable {
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

    //abstract void serialisera();

    //abstract deserliasera();

}
