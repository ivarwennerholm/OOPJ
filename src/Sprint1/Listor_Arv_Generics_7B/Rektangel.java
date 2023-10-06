package Sprint1.Listor_Arv_Generics_7B;

public class Rektangel extends Figur {

    private double bredd, höjd;
    Rektangel (double bredd, double höjd) {
        this.bredd = bredd;
        this.höjd = höjd;
    }

    @Override
    public double area() {
        return (this.bredd * this.höjd);
    }
}
