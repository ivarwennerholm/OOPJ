package Sprint2.Geometriska_Figurer_1;

public class IsoscelesTriangle implements Figure {
    int base, leg;

    public IsoscelesTriangle(int base, int leg) {
        this.base = base;
        this.leg = leg;
    }

    public double getCircumference() {
        return (base + leg * 2);
    }

    public double getArea() {
        double height = Math.sqrt((leg * leg) - (((double) base / 2) * ((double) base / 2)));
        return ((base * height) / 2);
    }
}
