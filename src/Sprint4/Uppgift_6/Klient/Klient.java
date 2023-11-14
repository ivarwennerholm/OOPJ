package Sprint4.Uppgift_6.Klient;

import Sprint4.Uppgift_6.Utils.Kompis;

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
             BufferedReader inStr = new BufferedReader(new InputStreamReader(sock.getInputStream()));
             BufferedReader inStd = new BufferedReader(new InputStreamReader(System.in))
        ) {

            while ((temp = inStr.readLine()) != null) {
                System.out.print(temp);
                while ((temp = inStd.readLine()) != null) {
                    if (temp.equalsIgnoreCase("avsluta"))
                        System.exit(0);
                    System.out.println("Klient input: " + temp);
                    outStr.println(temp);
                    while ((obj = inObj.readObject()) != null) {
                        System.out.println("Klient: objekt mottaget");
                        if (obj instanceof Kompis kompis)
                            System.out.println("Klient: " + kompis);
                        else
                            System.out.println("Felaktigt objekt");
                        break;
                    }
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new Klient();
    }
}
