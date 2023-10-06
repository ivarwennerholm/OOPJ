package Sprint1.Factory_Pattern_8;

public class Liksidigtriangel extends Figur {
    private double bredd, höjd;
    private Punkt startpunkt;

    Liksidigtriangel(int startx, int starty, double bredd, double höjd) {
        this.bredd = bredd;
        this.höjd = höjd;
        super.setStartpunkt(startx, starty);


    }

    public double Area() {
        return ((this.bredd * this.höjd) / 2);
    }
}
