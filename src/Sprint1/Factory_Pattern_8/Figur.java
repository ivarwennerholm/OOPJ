package Sprint1.Factory_Pattern_8;

abstract public class Figur {

    private Punkt startpunkt;
    public void setStartpunkt(int startx, int starty) {
        this.startpunkt = new Punkt(startx, starty);
    }

    abstract public double Area();
}
