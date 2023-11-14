package Sprint4.Livekodning.Bilregister.Klient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Klient {
    public static void main(String[] args) throws IOException {
        int port = 5555;
        String ip = "127.0.0.1";
        String temp = "";

        try (Socket sock = new Socket(ip, port);
             PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
             BufferedReader br = new BufferedReader((new InputStreamReader(sock.getInputStream())));
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))
        ) {
            while ((temp = userInput.readLine()) != null) {
                pw.println(temp);
                temp = br.readLine();
                System.out.println(temp);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}