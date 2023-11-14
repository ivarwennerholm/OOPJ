package Sprint4.Uppgift_7.Klient;

import Sprint4.Uppgift_7.Utils.Init;
import Sprint4.Uppgift_7.Utils.Respons;

import java.io.*;
import java.net.Socket;

public class Klient {
    int port = 5555;
    String ip = "127.0.0.1";
    String temp = "";
    Object obj;

    public Klient() {
        try (Socket sock = new Socket(ip, port);
             PrintWriter outStr = new PrintWriter(sock.getOutputStream(), true);
             ObjectInputStream inObj = new ObjectInputStream(sock.getInputStream());
             BufferedReader inStd = new BufferedReader(new InputStreamReader(System.in))
        ) {
            System.out.println("Klient: Väntar på initiering..."); // TEST
            while ((obj = inObj.readObject()) != null && obj instanceof Init) {
                System.out.println("Klient: Initiering mottagen"); // TEST
                break;
            }
            while (true) {
                System.out.print("Klient: Vilken kompis vill du söka på? ");
                while ((temp = inStd.readLine()) != null) {
                    if (temp.equalsIgnoreCase("avsluta")) {
                        System.out.println("Klient: avslutas");
                        System.exit(0);
                    }
                    //System.out.println("Klient input: " + temp); // TEST
                    outStr.println(temp);
                    while ((obj = inObj.readObject()) != null) {
                        //System.out.println("Klient: objekt mottaget"); // TEST
                        if (obj instanceof Respons respons) {
                            if (respons.isPerson())
                                System.out.println("Klient: " + respons);
                            else
                                System.out.println("Klient: ingen sådan kompis i registret");
                        } else
                            System.out.println("Klient: Felaktigt objekt");
                        break;
                    }
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        new Klient();
    }

}