package Sprint4.Uppgift_7.Server;

import Sprint4.Uppgift_7.Utils.Kompis;
import Sprint4.Uppgift_7.Utils.Respons;

public class ResponsDAO {

    public Respons skapaRespons(Kompis kompis) {
        if (kompis != null)
            return new Respons(true, kompis);
        else
            return new Respons(false);
    }

}