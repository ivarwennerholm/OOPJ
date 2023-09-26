package Sprint1.Djur_6;

public class Main {
    public static void main(String[] args) {
        Djur[] array = new Djur[3];
        array[0] = new Sköldpadda();
        array[1] = new Kolibri();
        array[2] = new Val();
        for (Djur i: array)
            i.läte();
    }
}
