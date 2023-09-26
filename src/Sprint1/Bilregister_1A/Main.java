package Sprint1.Bilregister_1A;

public class Main {
    Car car = new Car("Peugout", "307", "LWT979");
    Carowner owner = new Carowner("Ivar Wennerholm", "Ludvigsberggatan", 44);
    public static void main(String[] args) {
        Main m = new Main();
        m.car.setOwner(m.owner);
        System.out.println(m.car);

    }
}
