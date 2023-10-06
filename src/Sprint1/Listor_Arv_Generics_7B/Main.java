package Sprint1.Listor_Arv_Generics_7B;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List figurlista = new LinkedList();
        LiksidigTriangel liksidigTriangel = new LiksidigTriangel(12.5, 23);
        Cirkel cirkel = new Cirkel(13);
        Rektangel rektangel = new Rektangel(13, 20.44);
        figurlista.add(liksidigTriangel);
        figurlista.add(cirkel);
        figurlista.add(rektangel);
        for (Object o : figurlista) {
            System.out.println("En " + o.getClass().getSimpleName() + " med area " + ((Figur)o).area());
        }
    }
}
