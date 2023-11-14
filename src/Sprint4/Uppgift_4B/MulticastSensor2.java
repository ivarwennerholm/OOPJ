package Sprint4.Uppgift_4B;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastSensor2 extends JFrame implements ActionListener {

    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JLabel stadLabel = new JLabel("Stad:");
    JLabel tempLabel = new JLabel("Temp:");
    JTextField stadText = new JTextField();
    JTextField tempText = new JTextField();
    JButton sendButton = new JButton("Skicka");
    byte[] data;
    int port = 4343;
    InetAddress ip = InetAddress.getByName("234.234.234.234");
    MulticastSocket mcs = new MulticastSocket();
    String message;


    MulticastSensor2() throws IOException {
        System.out.println("TEST");
        setSize(150, 150);
        northPanel.setLayout(new GridLayout(2, 2));
        northPanel.add(stadLabel);
        northPanel.add(stadText);
        northPanel.add(tempLabel);
        northPanel.add(tempText);
        southPanel.add(sendButton);
        setLayout(new BorderLayout());
        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);

        sendButton.addActionListener(this);

        setVisible(true);
        //pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    }

    public static void main(String[] args) throws IOException {
        new MulticastSensor2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        message = (stadText.getText() + ", " + tempText.getText() + "\u2103" + "\n");
        data = message.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, ip, port);
        try {
            mcs.send(packet);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}

