package Sprint2.Övningsuppgift_12;

import Sprint1.ArvOchArrayer_3A.Student;

import java.io.*;

public class Bil extends Fordon implements Serializable {
    private int antalVäxlar;
    private int växelJustNu;

    protected Bil(int vikt, int antalVäxlar) {
        super(vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = 0;
    }

    protected void växla(int växel) {
        if (växel < 0 || växel > antalVäxlar)
            System.out.println("Felaktig växel, ange en växel mellan 1 och " + antalVäxlar);
        else {
            this.växelJustNu = växel;
            System.out.println("Bilen är lagd i växel: " + this.växelJustNu);
        }
    }

    protected String whoAmI() {
        return "Bil";
    }

    public int getAntalVäxlar() {
        return antalVäxlar;
    }

    public void setAntalVäxlar(int antalVäxlar) {
        this.antalVäxlar = antalVäxlar;
    }

    public int getVäxelJustNu() {
        return växelJustNu;
    }


    public static void serialisera() throws IOException {
        Bil bil = new Bil(1750, 6);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./src/fordon.ser", true));
        out.writeObject(bil);
        out.close();
        System.out.println("bil inlagd i fordon.ser"); // TEST
    }

    public static Bil deserialisera() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("./src/fordon.ser"));
        Bil bil = (Bil) in.readObject();
        in.close();
        return bil;
    }

    @Override
    public String toString() {
        return (this.whoAmI() + "\n" +
                "Vikt: " + this.getVikt() + "\n" +
                "Hastighet: " + this.getHastighet() + "\n" +
                "Antal växlar: " + this.antalVäxlar + "\n" +
                "Växel just nu: " + this.växelJustNu);
    }
}