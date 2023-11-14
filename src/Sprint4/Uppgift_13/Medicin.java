package Sprint4.Uppgift_13;

public class Medicin extends Thread {
    int frekvens;
    String namn;

    public Medicin(int frekvens, String namn) {
        this.frekvens = ((int) koverteraFrekvens(frekvens));
        this.namn = namn;
    }

    public int koverteraFrekvens(int frekvens) {
        double outputd = (60 / ((double) frekvens)) * 1000;
        return ((int) outputd);
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(frekvens);
                System.out.println("Dags att ta din " + namn);
            } catch (InterruptedException e) {
                break;
            }
        }

    }
}
