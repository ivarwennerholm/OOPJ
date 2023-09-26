package Sprint1.Fordon_2A;

public class Cykel extends Fordon {
    private int antalVäxlar;
    private int växelJustNu;

    protected Cykel(int vikt, int antalVäxlar) {
        super(vikt);
        this.antalVäxlar = antalVäxlar;
    }

    protected String whoAmI() {
        return "Cykel";
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

    public void växla(int växel) {
        if (växelJustNu < 0 || växel > antalVäxlar)
            System.out.println("Felaktig växel, ange en växel mellan 1 och " + antalVäxlar);
        else {
            this.växelJustNu = växel;
            System.out.println("Cykeln är lagd i växel: " + this.växelJustNu);
        }
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
