package Sprint1.Factory_Pattern_8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figur> figurlista = new LinkedList<>();
        Figurfabrik figurfabrik = new Figurfabrik();
        figurlista.add(figurfabrik.getFigur("rund"));
        figurlista.add(figurfabrik.getFigur("trekantig"));
        figurlista.add(figurfabrik.getFigur("fyrkantig"));
        for (Figur f : figurlista) {
            System.out.println("En " + f.getClass().getSimpleName() + " med area " + f.Area());
        }
    }
}
