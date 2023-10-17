package Sprint2.Övningsuppgift_12;

import java.io.*;

public class Båt extends Fordon implements Serializable{
    private int dödvikt;

    public Båt(int vikt, int dödvikt) {
        super(vikt);
        this.dödvikt = dödvikt;
    }

    public void sväng(String riktning) {
        if (riktning == "höger")
            System.out.println("Båten svänger åt höger");
        else if (riktning == "vänster")
            System.out.println("Båten svänger åt vänster");
        else
            System.out.println("Ogiltig riktning");
    }

    protected String whoAmI() {
        return "Båt";
    }

    public int getDödvikt() {
        return dödvikt;
    }

    public void setDödvikt(int dödvikt) {
        this.dödvikt = dödvikt;
    }


    public static void serialisera() throws IOException {
        Båt båt = new Båt(20500, 9);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./src/fordon.ser", true));
        out.writeObject(båt);
        out.flush();
        System.out.println("båt inlagd i fordon.ser"); // TEST

    }

    public static Båt deserialisera() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("./src/fordon.ser"));
        Båt båt = (Båt) in.readObject();
        return båt;
    }
    @Override
    public String toString() {
        return (this.whoAmI() + "\n" +
                "Vikt: " + this.getVikt() + "\n" +
                "Hastighet: " + this.getHastighet() + "\n" +
                "Dödvikt: " + this.dödvikt);
    }
}