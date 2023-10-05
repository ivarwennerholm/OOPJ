package Sprint1.Listor_Arv_Generics_7A;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figur> figurlista = new LinkedList<>();
        Figur liksidigTriangel = new LiksidigTriangel(12.5, 23);
        Figur circel = new Circel(13);
        Figur rektangel = new Rektangel(13, 20.44);
        Collections.addAll(figurlista, liksidigTriangel,circel, rektangel);
        for (Figur f : figurlista) {
            System.out.println("Typ av figur: " + f.getClass().getSimpleName() + "\tArea: " + f.Area());
        }
    }
}
