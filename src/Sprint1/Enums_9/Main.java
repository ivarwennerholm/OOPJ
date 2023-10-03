package Sprint1.Enums_9;

public class Main {
    public static void main(String[] args) {
        for (RomerskaSiffror r : RomerskaSiffror.values()) {
            System.out.println(r + " " + r.numericalValue);
        }
    }
}