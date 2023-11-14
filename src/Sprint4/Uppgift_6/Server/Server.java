package Sprint4.Uppgift_6.Server;

import Sprint4.Uppgift_6.Utils.Kompis;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    int port = 5555;
    String temp = "";
    KompisDAO dao = new KompisDAO();
    Kompis kompis;

    public Server() {
        try (ServerSocket servSock = new ServerSocket(port);
             Socket sock = servSock.accept();
             ObjectOutputStream outObj = new ObjectOutputStream(sock.getOutputStream());
             PrintWriter outStr = new PrintWriter(sock.getOutputStream(), true);
             BufferedReader inStr = new BufferedReader(new InputStreamReader(sock.getInputStream()))
        ) {
            while (true) {
                outStr.println("Server: Vilken kompis vill du veta numret till? ");
                System.out.println("Server: prompt skickad");
                while((temp = inStr.readLine()) != null) {
                    System.out.println("Server: mottagit \"" + temp + "\" från Klienten");
                    kompis = dao.sökKompis(temp.trim());
                    System.out.println("Server: " + kompis);
                    outObj.writeObject(kompis);
                    System.out.println("Server: kompis skickad");
                    break;
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}

