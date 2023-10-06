package Sprint1.Factory_Pattern_8;

public class Circel extends Figur {
    private double radie;

    Circel(int startx, int starty, double radie) {
        this.radie = radie;
        super.setStartpunkt(startx, starty);
    }

    @Override
    public double Area() {
        return (Math.PI * (this.radie * this.radie));
    }
}
