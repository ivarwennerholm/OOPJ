package Sprint4.Uppgift_7.Utils;

import java.io.Serializable;


public class Respons implements Serializable {

    boolean isPerson;
    Kompis kompis;

    public Respons (boolean isPerson) {
        this.isPerson = isPerson;
    }
    public Respons(boolean isPerson, Kompis kompis) {
        this.isPerson = isPerson;
        this.kompis = kompis;
    }

    @Override
    public String toString() {
        return ("Är person = " + this.isPerson + ", Kompis = " + kompis);
    }

    public boolean isPerson() {
        return isPerson;
    }

    public Kompis getKompis() {
        return kompis;
    }

}
