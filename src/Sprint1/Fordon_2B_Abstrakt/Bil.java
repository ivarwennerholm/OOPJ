package Sprint1.Fordon_2B_Abstrakt;

public class Bil extends Fordon {
    private int antalVäxlar;
    private int växelJustNu;

    public Bil(int vikt, int antalVäxlar) {
        super(vikt);
        this.antalVäxlar = antalVäxlar;
    }

    public void printMe() {
        System.out.println("Bil" + "\n" +
                "Vikt: " + super.getVikt() + "\n" +
                "Hastighet: " + super.getHastighet() + "\n" +
                "Antal växlar: " + this.antalVäxlar + "\n" +
                "Växel just nu: " + this.växelJustNu);
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

    public void setVäxelJustNu(int växelJustNu) {
        this.växelJustNu = växelJustNu;
    }
}