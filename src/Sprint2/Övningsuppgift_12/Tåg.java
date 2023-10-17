package Sprint2.Övningsuppgift_12;

public class Tåg extends Fordon {

    private int antalVagnar;

    public Tåg(int vikt, int antalVagnar) {
        super(vikt);
        this.antalVagnar = antalVagnar;
    }

    protected String whoAmI() {
        return "Tåg";
    }

    public int getAntalVagnar() {
        return antalVagnar;
    }

    public void setAntalVagnar(int antalVagnar) {
        this.antalVagnar = antalVagnar;
    }

    public void kopplaVagn() {
        this.antalVagnar++;
    }

    @Override
    public String toString() {
        return (this.whoAmI() + "\n" +
                "Vikt: " + this.getVikt() + "\n" +
                "Hastighet: " + this.getHastighet() + "\n" +
                "Antal vagnar: " + this.antalVagnar);
    }
}
