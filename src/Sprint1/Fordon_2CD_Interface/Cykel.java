package Sprint1.Fordon_2CD_Interface;

public class Cykel extends Fordon implements Printable, Hjulburen {
    private int antalVäxlar;
    private int växelJustNu;

    final private int antaHjul = 2;

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
    public String printMe() {
        return (this.whoAmI() + "\n" +
                "Vikt: " + this.getVikt() + "\n" +
                "Hastighet: " + this.getHastighet() + "\n" +
                "Antal växlar: " + this.antalVäxlar + "\n" +
                "Växel just nu: " + this.växelJustNu + "\n" +
                "Antal hjul: " + this.antaHjul);
    }

    @Override
    public int getAntalHjul() {
        return antaHjul;
    }
}
