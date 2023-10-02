package Sprint1.Inlämningsuppgift1;

public interface Skrivbar {

    public String skrivMenu();

    public default String skrivAllInfo() {
        return "Skriver från interface";
    }
}
