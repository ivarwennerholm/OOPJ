package Sprint1.Inlämningsuppgift1;

public class Greenest {


    public static void main(String[] args) {
        KöttätandeVäxt meatloaf = new KöttätandeVäxt(0.7, "Meatloaf");
        Gästlista.addGäst(meatloaf);
        Palm laura = new Palm(5, "Laura");
        Gästlista.addGäst(laura);
        Palm olof = new Palm(1, "Olof");
        Gästlista.addGäst(olof);
        Kaktus igge = new Kaktus(0.2, "Igge");
        Gästlista.addGäst(igge);

        Gästlista.printGästlista();
        Gästlista.vattna();
    }

}