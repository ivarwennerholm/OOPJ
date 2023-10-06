package Sprint1.Listor_Arv_Generics_7B;

public class Cirkel extends Figur {
    private double radie;

    Cirkel(double radie) {
        this.radie = radie;
    }

    @Override
    public double area() {
        return (Math.PI * (this.radie * this.radie));
    }
}
