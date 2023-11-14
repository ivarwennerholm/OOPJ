package Sprint4.Uppgift_5A.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    int port = 5555;
    String temp = "";
    KompisDAO dao = new KompisDAO();

    public Server() {
        try (ServerSocket servSock = new ServerSocket(port);
             Socket sock = servSock.accept();
             PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
             BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()))
        ) {
            while (true) {
                pw.println("Vilken kompis vill du veta numret till? : ");
                while((temp = br.readLine()) != null) {
                    pw.println(dao.sökKompis(temp.trim()));
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

