package Sprint4.Uppgift_7.Utils;

import java.io.Serializable;

public class Kompis implements Serializable {
    String namn;
    String nummer;

    public Kompis(String namn, String nummer) {
        this.namn = namn;
        this.nummer = nummer;
    }
    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    @Override
    public String toString () {
        return (this.namn + " har nummmer " + this.nummer);
    }
}
