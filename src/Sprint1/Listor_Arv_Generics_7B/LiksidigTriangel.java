package Sprint1.Listor_Arv_Generics_7B;

public class LiksidigTriangel extends Figur {
    private double bredd, höjd;

    LiksidigTriangel(double bredd, double höjd) {
        this.bredd = bredd;
        this.höjd = höjd;
    }

    public double area() {
        return ((this.bredd * this.höjd) / 2);
    }
}
