package Sprint1.Listor_Arv_Generics_7A;

public class Circel extends Figur{
    private double radie;

    Circel (double radie) {
        this.radie = radie;
    }

    @Override
    public double Area() {
        return (Math.PI * (this.radie * this.radie));
    }
}
