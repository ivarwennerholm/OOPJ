package Sprint1.Factory_Pattern_8;

public class Rektangel extends Figur {

    private double bredd, höjd;

    Rektangel(int startx, int starty, double bredd, double höjd) {
        this.bredd = bredd;
        this.höjd = höjd;
        super.setStartpunkt(startx, starty);
    }

    @Override
    public double Area() {
        return (this.bredd * this.höjd);
    }
}
