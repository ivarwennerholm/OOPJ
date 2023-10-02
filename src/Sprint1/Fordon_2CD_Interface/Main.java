package Sprint1.Fordon_2CD_Interface;

public class Main {

    public static void main(String[] args) {
        Hjulburen hjulburenFordon = new Fordon(1000);
        Fordon fordon = new Fordon(1000);
        Hjulburen hjulburenBil = new Bil(750, 5);
        Bil bil = new Bil(750, 5);
        Hjulburen hjulburenCykel = new Cykel(75, 21);
        Cykel cykel = new Cykel(45, 21);
        bil.ändraHastighet(90);
        bil.växla(5);
        cykel.ändraHastighet(35);
        cykel.växla(15);
        System.out.println();
        System.out.println("hjulburenFordon, antal hjul: " + hjulburenFordon.getAntalHjul());
        System.out.println("fordon, antal hjul: " + fordon.getAntalHjul());
        System.out.println("hjulburenBil, antal hjul: " + hjulburenBil.getAntalHjul());
        System.out.println("bil, antal hjul: " + bil.getAntalHjul());
        System.out.println("hjulburenCykel, antal hjul: " + hjulburenCykel.getAntalHjul());
        System.out.println("cykel, antal hjul: " + cykel.getAntalHjul());
    }
}
