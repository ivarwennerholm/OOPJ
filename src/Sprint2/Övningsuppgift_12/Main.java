package Sprint2.Övningsuppgift_12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //List<Fordon> list = new ArrayList<Fordon>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*Main m = new Main();
        Bil bil = new Bil(1750, 5);
        Båt båt = new Båt(4300, 2300);
        Cykel cykel = new Cykel(72, 21);
        Tåg tåg = new Tåg(22000, 10);
        m.list.add(bil);
        m.list.add(båt);
        m.list.add(cykel);
        m.list.add(tåg);*/
        Bil.serialisera();
        Bil.serialisera();
        //Båt.serialisera();
        Fordon fordon1 = Bil.deserialisera();

        //Fordon fordon2 = Båt.deserialisera();
        //Båt båt = Båt.deserialisera();
        //System.out.println(fordon1);
        //System.out.println(fordon2);
        //System.out.println(bil);
    }
}