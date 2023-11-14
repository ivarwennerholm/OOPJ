package Sprint4.Uppgift_6.Server;

import Sprint4.Uppgift_6.Utils.Kompis;

import java.util.ArrayList;
import java.util.List;

public class KompisDAO {

    List<Kompis> telefonbok = new ArrayList<>();

    public KompisDAO() {
        Kompis k1 = new Kompis("Andreas", "070-22290339");
        Kompis k2 = new Kompis("Karin", "070-12300044");
        Kompis k3 = new Kompis("Holger", "070-22358575");
        Kompis k4 = new Kompis("Konrad", "070-203040999");
        Kompis k5 = new Kompis("Lisa", "070-22290339");
        telefonbok.add(k1);
        telefonbok.add(k2);
        telefonbok.add(k3);
        telefonbok.add(k4);
        telefonbok.add(k5);
    }

    public List<Kompis> getTelefonbok() {
        return telefonbok;
    }

    public Kompis sökKompis(String namn) {
        Kompis output = null;
        for (Kompis kompis : telefonbok) {
            if (kompis.getNamn().equalsIgnoreCase(namn))
                output = kompis;
        }
        return output;
    }
}
