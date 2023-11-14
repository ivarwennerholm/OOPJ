package Sprint4.Uppgift_2A;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Sender {

    String quote1 = "Pengar växer inte på träd";
    String quote2 = "Den som spar han har";
    String quote3 = "Tänk efter före";
    String quote4 = "Smaken är som baken, delad";
    String quote5 = "Var dag har nog av sitt lidande";
    ArrayList<String> quotes = new ArrayList<>();
    byte[] data;
    Sender() throws IOException, InterruptedException {
        quotes.add(quote1); quotes.add(quote2); quotes.add(quote3); quotes.add(quote4); quotes.add(quote5);
        int port = 12544;
        InetAddress reciever = InetAddress.getLocalHost();
        DatagramSocket socket = new DatagramSocket();
        while (true) {
            for (String quote: quotes) {
                data = quote.getBytes();
                DatagramPacket packet = new DatagramPacket(data, data.length, reciever, port);
                TimeUnit.SECONDS.sleep(5);
                socket.send(packet);
            }

        }
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        new Sender();
    }
}
