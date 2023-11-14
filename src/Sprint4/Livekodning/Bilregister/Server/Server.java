package Sprint4.Livekodning.Bilregister.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
        public static void main(String[] args) throws IOException {
            int port = 5555;
            String temp = "", answer = "";
            BilDAO databas = new BilDAO();

            try (ServerSocket serv = new ServerSocket(port);
                 Socket sock = serv.accept();
                 PrintWriter pw = new PrintWriter(sock.getOutputStream(), true);
                 BufferedReader br = new BufferedReader((new InputStreamReader(sock.getInputStream())))
            ) {
                while ((temp = br.readLine()) != null) {
                    answer = databas.sökBil(temp.trim());
                    pw.println(answer);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }