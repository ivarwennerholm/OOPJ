package Sprint4.Livekodning.Bilregister.Server;

import java.util.ArrayList;
import java.util.List;

public class BilDAO {

    List<Bil> allaBilar = new ArrayList<>();

    public BilDAO() {
        Bil b1 = new Bil("ABC123", "röd", "Saab kombi");
        Bil b2 = new Bil("XLB777", "blå", "Ford Fiesta");
        Bil b3 = new Bil("SKJ911", "grön", "Mazda X7");
        Bil b4 = new Bil("LPO901", "orange", "Volvo Amazon");
        allaBilar.add(b1);
        allaBilar.add(b2);
        allaBilar.add(b3);
        allaBilar.add(b4);
    }

    public List<Bil> getAllaBilar() {
        return allaBilar;
    }

    public String sökBil(String regnummer) {
        for (int i = 0; i < allaBilar.size(); i++) {
            if (allaBilar.get(i).getRegnummer().equalsIgnoreCase(regnummer)) {
                return allaBilar.get(i).toString();
            }
        }
        return "";
    }
}
