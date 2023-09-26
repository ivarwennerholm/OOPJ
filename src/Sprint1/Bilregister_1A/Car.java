package Sprint1.Bilregister_1A;
public class Car {
    private String brand, model, licenceNumber;
    private Carowner owner;
    public Car (String brand, String model, String licenceNumber) {
        this.brand = brand;
        this.model = model;
        this.licenceNumber = licenceNumber;
    }

    protected void setOwner (Carowner owner) {
        this.owner = owner;
    }

    @Override
    public String toString () {
        return ("Registreringsnummer: " + this.licenceNumber + "\n" +
                "Märke: " + this.brand + "\n" +
                "Modell: " + this.model + "\n" +
                "Ägare: " + this.owner.getName() + "\n" +
                "Adress: " + this.owner.getAddress() + "\n" +
                "Ålder: " + this.owner.getAge());
    }

}