package Sprint1.Bankomaten_10;

import java.util.ArrayList;

class Bankomaten {
    ArrayList<Kund> kunder = new ArrayList<>();
    ArrayList<Personal> personal = new ArrayList<>();
    public static void main(String[] args) {
        Bankomaten bankomaten = new Bankomaten();
        Kund kund1 = new Kund("Lena Nyman");
        bankomaten.kunder.add(kund1);
        Kund kund2 = new Kund("Gösta Ekman");
        bankomaten.kunder.add(kund2);
        Personal personal1 = new Personal("Gordon Gecko", 75000);
        bankomaten.personal.add(personal1);
        Personal personal2 = new Personal("Milton Friedman", 100000);
        bankomaten.personal.add(personal2);

        kund1.nyttKonto(10000, 3.75 );
        kund1.nyttKonto(1.75);
        kund1.nyttLån(500000, 4.45, personal1);
        kund1.nyttLån(250000, 4.00, personal2);

        kund1.getLån(1).setRäntesats(4.75, personal1);
        kund1.getLån(1).setRäntesats(4.85, personal1);


        kund1.listaKonton();
        kund1.listaLån();
        bankomaten.listaKunder();
        bankomaten.listaPersonal();

        kund1.getLån(1).listaRänteändringar();


    }

    void listaKunder() {
        System.out.println("Kundlista:");
        for (Kund k : kunder) {
            System.out.println(k.getNamn());
        }
        System.out.println();
    }

    void listaPersonal() {
        System.out.println("Personallista:");
        for (Personal p : personal) {
            System.out.println(p.getNamn());
        }
        System.out.println();
    }

}
