package Sprint4.Uppgift_13;

import java.util.ArrayList;
import java.util.Scanner;

public class MedicinReminder {

    ArrayList<Medicin> medicinlista = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    String namn;
    int frekvens;

    public void fråga() {
        while (true) {
            System.out.print("Namn på medicin: ");
            namn = scan.nextLine();
            if (namn.isEmpty())
                break;
            System.out.print("Hur många gånger per minut: ");
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            frekvens = Integer.parseInt(input);
            medicinlista.add(new Medicin(frekvens, namn));
        }
    }

    public void kör() throws InterruptedException {
        for (Medicin med: medicinlista) {
            med.start();
        }
        Thread.sleep(20000);
        for (Medicin med: medicinlista) {
            med.interrupt();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MedicinReminder mr = new MedicinReminder();
        mr.fråga();
        mr.kör();
    }
}
