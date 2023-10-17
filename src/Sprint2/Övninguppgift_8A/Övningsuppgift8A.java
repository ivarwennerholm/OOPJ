package Sprint2.Övninguppgift_8A;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Övningsuppgift8A {
    double värde, medelvärde;
    double summa = 0;
    double min = Double.MAX_VALUE;
    double max = -Double.MAX_VALUE;
    int antalMätningar = 0;
    boolean fortsätt = true;

    String path = "./src/temp.txt";

    public void mainProgram(String optionalPath) {
        if (optionalPath != null)
            this.path = optionalPath;
        while (this.fortsätt) {
            try (BufferedReader br = new BufferedReader(new FileReader(this.path))) {
                Scanner scan = new Scanner(br);
                while (scan.hasNextDouble()) {
                    this.värde = scan.nextDouble();
                    this.min = this.checkMin(this.värde);
                    this.max = this.checkMax(this.värde);
                    this.summa = this.addSumma(this.värde);
                    this.antalMätningar++;
                }
                this.calculateAverage();
                this.fortsätt = false;
            } catch (FileNotFoundException e) {
                System.out.println("Hittade inte filen:");
                e.printStackTrace();
                System.exit(0);
            } catch (IOException e) {
                System.out.println("IOException:");
                e.printStackTrace();
                System.exit(0);
            } catch (Exception e) {
                System.out.println("Ospecificerat fel:");
                e.printStackTrace();
                System.exit(0);
            }
        }
        System.out.println("Högsta uppmätta värdet: " + this.max);
        System.out.println("Lägsta uppmätta värdet: " + this.min);
        System.out.println("Medeltemperaturen under de senaste " + this.antalMätningar + " dagarna: " + this.medelvärde);
    }

    public static void main(String[] args) {
        Övningsuppgift8A övn = new Övningsuppgift8A();
        övn.mainProgram(null);
    }

    public double checkMin(double värde) {
        if (värde < this.min)
            this.min = värde;
        return this.min;
    }

    public double checkMax(double värde) {
        if (värde > this.max)
            this.max = värde;
        return this.max;
    }

    public double addSumma(double värde) {
        this.summa = this.summa + värde;
        return this.summa;
    }

    public double calculateAverage() {
        this.medelvärde = this.summa / this.antalMätningar;
        return this.medelvärde;
    }

    public void setAntalMätningar(int antalMätningar) {
        this.antalMätningar = antalMätningar;
    }
}