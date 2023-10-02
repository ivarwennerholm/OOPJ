package Sprint1.Inlämningsuppgift1;

public class Greenest {


    public static void main(String[] args) {
        Gästlista gästlista = new Gästlista();
        KöttätandeVäxt meatloaf = new KöttätandeVäxt(0.7, "Meatloaf");
        gästlista.addGäst(meatloaf);
        Palm laura = new Palm(5, "Laura");
        gästlista.addGäst(laura);
        Palm olof = new Palm(1, "Olof");
        gästlista.addGäst(olof);
        Kaktus igge = new Kaktus(0.2, "Igge");
        gästlista.addGäst(igge);

        gästlista.printGästlista();
        gästlista.vattna();
    }

}