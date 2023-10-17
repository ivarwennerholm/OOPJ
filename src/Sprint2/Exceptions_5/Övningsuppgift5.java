/*package Sprint2.Exceptions_5;

import Sprint2.Övninguppgift_8A.Övningsuppgift8A;

import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showInputDialog;

import java.util.*;

public class Övningsuppgift5 {
    int antalDagar;
    double dagsPris;
    String bil;
    String indata = showInputDialog("Ange antal dagar, pris per dag samt bilmodell");
    Scanner scan = new Scanner(indata);




    public static void main(String[] arg) {
        Övningsuppgift5 övn = new Övningsuppgift5();

        boolean klar = false;

        while (!klar) {
            if (indata == null)
                System.exit(0);

            try {
                antalDagar = sc.nextInt();
                dagsPris = sc.nextDouble();
                bil = sc.nextLine();
                klar = true;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Felaktigt tal");
            } catch (NoSuchElementException e) {
                System.out.println("Indata saknas");
            } catch (Exception e) {

            }
        }
        double totPris = dagsPris * antalDagar;
        String s = String.format("Totalt pris för %s: %.2f",
                bil, totPris);
        showMessageDialog(null, s);
    }
}*/