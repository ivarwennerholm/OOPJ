package Sprint4.Uppgift_4A;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    int port = 4444;
    byte[] data = new byte[254];

    Receiver() throws IOException {
        DatagramPacket packet = new DatagramPacket(data, data.length);
        DatagramSocket socket = new DatagramSocket(port);
        while (true) {
            socket.receive(packet);
            int cutoff = (int) data[0];
            System.out.println(cutoff); // TEST
            String stad = new String(packet.getData(), 1, cutoff);
            //String temp = new String(packet.getData(), cutoff + 1, 2);
            // FUNKAR EJ
            String temp = new String(packet.getData(), cutoff + 1, packet.getLength());
            System.out.println(stad + ": " + temp + "℃");
        }
    }

    public static void main(String[] args) throws IOException {
        new Receiver();
    }
}
