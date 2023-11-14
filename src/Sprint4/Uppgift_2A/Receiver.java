package Sprint4.Uppgift_2A;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    int port = 12544;
    byte[] data = new byte[254];

    Receiver() throws IOException {
        DatagramPacket packet = new DatagramPacket(data, data.length);
        DatagramSocket socket = new DatagramSocket(port);
        while (true) {
            socket.receive(packet);
            String ipaddress = packet.getAddress().toString().substring(1);
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println(ipaddress + ": " + message);
        }
    }

    public static void main(String[] args) throws IOException {
        new Receiver();
    }
}
