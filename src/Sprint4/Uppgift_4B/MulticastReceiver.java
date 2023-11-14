package Sprint4.Uppgift_4B;

import javax.swing.*;
import java.io.IOException;
import java.net.*;

public class MulticastReceiver extends JFrame {

    int port = 4343;
    byte[] data = new byte[254];
    MulticastSocket socket = new MulticastSocket(port);
    InetAddress ip = InetAddress.getByName("234.234.234.234");
    InetSocketAddress group = new InetSocketAddress(ip, port);
    NetworkInterface netIf = NetworkInterface.getByName("wlan2");

    String message, text = "";
    JPanel panel = new JPanel();
    JTextArea textArea = new JTextArea(20, 25);
    JScrollPane scrollPane = new JScrollPane(textArea);

    MulticastReceiver() throws IOException {
        add(panel);
        panel.add(scrollPane);
        textArea.setText(text);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        socket.joinGroup(group, netIf);
        while(true) {
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            message = new String(packet.getData(), 0, packet.getLength());
            text = text + message;
            textArea.setText(text);
            revalidate();
            repaint();
        }
    }

    public static void main(String[] args) throws IOException {
        new MulticastReceiver();
    }
}
