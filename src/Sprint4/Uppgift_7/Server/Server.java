package Sprint4.Uppgift_7.Server;

import Sprint4.Uppgift_7.Utils.Init;
import Sprint4.Uppgift_7.Utils.Kompis;
import Sprint4.Uppgift_7.Utils.Respons;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    int port = 5555;
    String temp = "";
    KompisDAO kompisDOA = new KompisDAO();
    ResponsDAO responsDOA = new ResponsDAO();
    Kompis kompis;
    Respons respons;

    public Server() {
        try (ServerSocket servSock = new ServerSocket(port);
             Socket sock = servSock.accept();
             ObjectOutputStream outObj = new ObjectOutputStream(sock.getOutputStream());
             BufferedReader inStr = new BufferedReader(new InputStreamReader(sock.getInputStream()))
        ) {
            outObj.writeObject(new Init());
            //System.out.println("Server: initieringsobjekt skickat"); // TEST
                while((temp = inStr.readLine()) != null) {
                    //System.out.println("Server: mottagit \"" + temp + "\" från Klienten"); // TEST
                    kompis = kompisDOA.sökKompis(temp.trim());
                    respons = responsDOA.skapaRespons(kompis);
                    //System.out.println("Server: " + respons); // TEST
                    outObj.writeObject(respons);
                    //System.out.println("Server: respons skickad"); // TEST
                }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        new Server();
    }

}