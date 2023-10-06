package Sprint1.Factory_Pattern_8;

public class Figurfabrik {

    public Figur getFigur(String form) {
        return switch (form) {
            case "rund" -> new Circel(randomInt(), randomInt(), randomDouble());
            case "trekantig" -> new Liksidigtriangel(randomInt(), randomInt(), randomDouble(), randomDouble());
            case "fyrkantig" -> new Rektangel(randomInt(), randomInt(), randomDouble(), randomDouble());
            default -> throw new RuntimeException("FELAKTIG INPUT");
        };
    }

    private int randomInt() {
        return ((int) (Math.random() * 100 + 1));
    }

    private double randomDouble() {
        return (Math.random() * 100 + 1);
    }
}
