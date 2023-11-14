package Sprint4.Uppgift_5A.Klient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Klient {

    int port = 5555;
    String ip = "127.0.0.1";
    String temp = "";

    public Klient() {
        try (Socket sock = new Socket(ip, port);
             PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
             BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
             BufferedReader ir = new BufferedReader(new InputStreamReader(System.in))
        ) {

            while ((temp = br.readLine()) != null) {
                System.out.print(temp);
                while ((temp = ir.readLine()) != null) {
                    if (temp.equalsIgnoreCase("avsluta"))
                        System.exit(0);
                    pw.println(temp);
                    System.out.println(br.readLine());
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new Klient();
    }
}
