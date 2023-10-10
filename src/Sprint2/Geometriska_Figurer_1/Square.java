package Sprint2.Geometriska_Figurer_1;

public class Square implements Figure {
    private int width, length;

    public Square(int width, int length) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return (this.length * this.width);
    }

    public double getCircumference() {
        return (this.length * 2 + this.width * 2);
    }
}
