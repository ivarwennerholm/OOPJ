package Sprint1.Inlämningsuppgift1;

import java.util.ArrayList;
import java.util.Scanner;

public class Gästlista {

    private ArrayList<Växt> gästlista = new ArrayList<>();

    public void addGäst(Växt växt) {
        gästlista.add(växt);
    }

    public void printGästlista() {
        System.out.println("Följande gröna sköningar bor på vårt hotell: ");
        for (int i = 0; i < gästlista.size(); i++) {
            System.out.println((i + 1) + ". " + gästlista.get(i).skrivMenu());
        }
    }

    public void vattna() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Vilken fotosyntesisk fining vill du vattna? ");
        String input = scan.nextLine();
        int i = findGästIndex(input);
        while (i == -1) {
            System.out.print("Ingen sådan gäst på hotellet, försök igen: ");
            input = scan.nextLine();
            i = findGästIndex(input);
        }
        System.out.println(gästlista.get(i).skrivAllInfo());
    }

    public int findGästIndex(String namn) {
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
