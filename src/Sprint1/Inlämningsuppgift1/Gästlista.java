package Sprint1.Inlämningsuppgift1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Gästlista {
    private ArrayList<Växt> gästlista = new ArrayList<>();
    private String menyText = "";

    public void addGäst(Växt växt) {
        gästlista.add(växt);
    }

    public void skapaMenyText() {
        //System.out.println("Följande gröna sköningar bor på vårt hotell: ");
        for (int i = 0; i < gästlista.size(); i++) {
            menyText = (menyText + (i + 1) + ". " + gästlista.get(i).skrivMenu() + "\n");
        }
        menyText = menyText + "Vilken fotosyntesisk fining vill du vattna?";
    }

    public String vilkenVäxtVillDuVattna() {
        String input = JOptionPane.showInputDialog(null, menyText);
        return input;
    }

    public void vattnaVäxt(String input) {
        int i = hittaGästIndex(input);
        while (i == -1) {
            JOptionPane.showMessageDialog(null, "Ingen sådan gäst på hotellet, försök igen!");
            String försökIgen = vilkenVäxtVillDuVattna();
            i = hittaGästIndex(försökIgen);
        }
        JOptionPane.showMessageDialog(null, (gästlista.get(i).skrivAllInfo()));
    }

    public int hittaGästIndex(String namn) {
        System.out.println();
        int index = -1;
        for (int i = 0; i < gästlista.size(); i++) {
            if (namn.equalsIgnoreCase(gästlista.get(i).getNamn())) {
                index = i;
            }
        }
        return index;
    }
}