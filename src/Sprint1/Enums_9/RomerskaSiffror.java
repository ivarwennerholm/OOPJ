package Sprint1.Enums_9;

public enum RomerskaSiffror {
    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    public int numericalValue;

    private RomerskaSiffror(int numericalValue) {
        this.numericalValue = numericalValue;
    }
}
