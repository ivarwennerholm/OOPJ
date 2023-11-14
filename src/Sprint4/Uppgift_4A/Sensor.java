package Sprint4.Uppgift_4A;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Sensor {

    byte[] stad, temp, cutoff, data;
    int port = 4444;
    Scanner scan = new Scanner(System.in);
    DatagramPacket packetStad, packetTemp, packetData;
    //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    InetAddress receiver = InetAddress.getLocalHost();
    DatagramSocket socket = new DatagramSocket();

    Sensor() throws IOException {
        while (true) {

            System.out.print("Ange stad: ");
            String stad = scan.nextLine();
            //stad = scan.nextLine().getBytes();
            System.out.print("Ange temp: ");
            String temp = scan.nextLine();
            //temp = scan.nextLine().getBytes();
            //BigInteger co = BigInteger.valueOf(stad.length);
            //cutoff = co.toByteArray();
            String cutoff = String.valueOf(scan.nextInt());
            String total = cutoff + stad + temp;
            //System.out.println("Cutoff length: " + cutoff.length); // TEST
            //System.out.println("Stad length: " + stad.length); // TEST
            //System.out.println("Temp length: " + temp.length); // TEST
            data = total.getBytes();

            //data = new byte[cutoff.length + stad.length + temp.length];
            //System.arraycopy(cutoff, 0, data, 0, cutoff.length);
            //System.arraycopy(stad, 0, data, cutoff.length, stad.length);
            //System.arraycopy(temp, 0, data, cutoff.length + stad.length, temp.length);
            //System.out.println("Data length: " + data.length); // TEST
            //System.out.println("Byte-arrayen: " + Arrays.toString(data));
            packetData = new DatagramPacket(data, data.length, receiver, port);
            //packetStad = new DatagramPacket(stad, stad.length, receiver, port);
            //packetTemp = new DatagramPacket(temp, temp.length, receiver, port);
            //socket.send(packetStad);
            //socket.send(packetTemp);
            socket.send(packetData);
        }
    }

    public static void main(String[] args) throws IOException {
        new Sensor();
    }
}
