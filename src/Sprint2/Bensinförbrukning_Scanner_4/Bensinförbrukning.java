package Sprint2.Bensinförbrukning_Scanner_4;

import javax.swing.*;
import java.util.Scanner;

public class Bensinförbrukning {

    double mätarställning1, mätarställning2, kördaMil, förbrukning, förbrukningPerMil;

    String utskrift;

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Bensinförbrukning bf = new Bensinförbrukning();
        System.out.print("Mätarställning för ett år sedan: ");
        bf.mätarställning1 = bf.scan.nextDouble();
        System.out.print("Mätarställning idag: ");
        bf.mätarställning2 = bf.scan.nextDouble();
        bf.kördaMil = bf.jämförMätarställning(bf.mätarställning2, bf.mätarställning1);
        System.out.print("Bensinförbrukning senaste året: ");
        bf.förbrukning = bf.scan.nextDouble();
        bf.förbrukningPerMil = bf.räknaUtFörbrukningPerMil(bf.förbrukning, bf.kördaMil);
        bf.utskrift = bf.genereraUtskrift(bf.förbrukning, bf.kördaMil, bf.förbrukningPerMil);
        System.out.println(bf.utskrift);

    }

    public double jämförMätarställning(double mätarställning2, double mätarställning1) {
        return (mätarställning2 - mätarställning1);
    }

    public double räknaUtFörbrukningPerMil(double förbrukning, double antalMil) {
        return (förbrukning / antalMil);
    }

    public String genereraUtskrift(double kördaMil, double förbrukning, double förbrukningPerMil) {
        return ("Antal körda mil: " + kördaMil + "\n" +
                "Antal liter bensin: " + förbrukning + "\n" +
                "Förbrukning per mil: " + förbrukningPerMil);
    }
}