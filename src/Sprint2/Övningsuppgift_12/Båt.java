package Sprint1.Fordon_2A;

public class Båt extends Fordon {
    private int dödvikt;

    public Båt(int vikt, int dödvikt) {
        super(vikt);
        this.dödvikt = dödvikt;
    }

    public void sväng(String riktning) {
        if (riktning == "höger")
            System.out.println("Båten svänger åt höger");
        else if (riktning == "vänster")
            System.out.println("Båten svänger åt vänster");
        else
            System.out.println("Ogiltig riktning");
    }

    protected String whoAmI() {
        return "Båt";
    }

    public int getDödvikt() {
        return dödvikt;
    }

    public void setDödvikt(int dödvikt) {
        this.dödvikt = dödvikt;
    }

    @Override
    public String toString() {
        return (this.whoAmI() + "\n" +
                "Vikt: " + this.getVikt() + "\n" +
                "Hastighet: " + this.getHastighet() + "\n" +
                "Dödvikt: " + this.dödvikt);
    }
}