package Sprint4.Uppgift_5B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TelefonbokClient {
    public static void main(String[] args) {
        int port = 12345;
        String ip = "172.20.201.9";
        String message = "";

        try (Socket socket = new Socket(ip, port); PrintWriter pw = new PrintWriter(socket.getOutputStream(),
                true);
             BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            while (true) {
                String header = bf.readLine();
                System.out.println(header);
                if ((message = userInput.readLine()) != null) {
                    pw.println(message);
                    String text = bf.readLine();
                    System.out.println(text);
                }
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
