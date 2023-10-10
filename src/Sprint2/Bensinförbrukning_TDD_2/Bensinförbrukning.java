package Sprint2.Bensinförbrukning_TDD_2;

import javax.swing.*;

public class Bensinförbrukning {

    double mätarställning1, mätarställning2, kördaMil, förbrukning, förbrukningPerMil;

    String utskriftString;

    StringBuilder utskriftStringBuilder = new StringBuilder();

    public static void main(String[] args) {
        Bensinförbrukning bf = new Bensinförbrukning();
        bf.mätarställning1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Mätarställning för ett år sedan"));
        bf.mätarställning2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Mätarställning idag"));
        bf.kördaMil = bf.jämförMätarställning(bf.mätarställning2, bf.mätarställning1);
        bf.förbrukning = Double.parseDouble(JOptionPane.showInputDialog(null, "Bensinförbrukning senaste året"));
        bf.förbrukningPerMil = bf.räknaUtFörbrukningPerMil(bf.förbrukning, bf.kördaMil);
        //bf.utskriftString = bf.genereraUtskriftString(bf.kördaMil, bf.förbrukning, bf.förbrukningPerMil);
        //System.out.println(bf.utskriftString);
        bf.utskriftStringBuilder = bf.genereraUtskriftStringBuilder(bf.förbrukning, bf.kördaMil, bf.förbrukningPerMil);
        System.out.println(bf.utskriftStringBuilder);

    }

    public double jämförMätarställning(double mätarställning2, double mätarställning1) {
        return (mätarställning2 - mätarställning1);
    }

    public double räknaUtFörbrukningPerMil(double förbrukning, double antalMil) {
        return (förbrukning / antalMil);
    }

    public String genereraUtskriftString(double kördaMil, double förbrukning, double förbrukningPerMil) {
        return ("Antal körda mil: " + kördaMil + "\n" +
                "Antal liter bensin: " + förbrukning + "\n" +
                "Förbrukning per mil: " + förbrukningPerMil);
    }

    public StringBuilder genereraUtskriftStringBuilder(double kördaMil, double förbrukning, double förbrukningPerMil) {
        utskriftStringBuilder.append("Antal körda mil: ").append(kördaMil).append("\n").append("Antal liter bensin: ").append(förbrukning).append("\n").append("Förbrukning per mil: ").append(förbrukningPerMil);
        return utskriftStringBuilder;
    }

}