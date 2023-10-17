package Sprint1.Fordon_2A;

public class Bil extends Fordon {
    private int antalVäxlar;
    private int växelJustNu;

    protected Bil(int vikt, int antalVäxlar) {
        super(vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = 0;
    }

    protected void växla(int växel) {
        if (växel < 0 || växel > antalVäxlar)
            System.out.println("Felaktig växel, ange en växel mellan 1 och " + antalVäxlar);
        else {
            this.växelJustNu = växel;
            System.out.println("Bilen är lagd i växel: " + this.växelJustNu);
        }
    }

    protected String whoAmI() {
        return "Bil";
    }

    public int getAntalVäxlar() {
        return antalVäxlar;
    }

    public void setAntalVäxlar(int antalVäxlar) {
        this.antalVäxlar = antalVäxlar;
    }

    public int getVäxelJustNu() {
        return växelJustNu;
    }

    @Override
    public String toString() {
        return (this.whoAmI() + "\n" +
                "Vikt: " + this.getVikt() + "\n" +
                "Hastighet: " + this.getHastighet() + "\n" +
                "Antal växlar: " + this.antalVäxlar + "\n" +
                "Växel just nu: " + this.växelJustNu);
    }
}