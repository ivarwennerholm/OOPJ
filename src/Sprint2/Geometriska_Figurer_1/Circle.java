package Sprint2.Geometriska_Figurer_1;

public class Circle implements Figure {

    int radie;

    public Circle(int radie) {
        this.radie = radie;
    }

    public double getCircumference() {
        return (2 * Math.PI * this.radie);
    }

    public double getArea() {
        return (Math.PI * this.radie * this.radie);
    }
}
