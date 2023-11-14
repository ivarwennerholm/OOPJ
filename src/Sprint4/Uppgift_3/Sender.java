package Sprint4.Uppgift_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Sender extends JFrame implements Runnable, ActionListener {

    byte[] data;
    int port = 12540;
    String ip = "234.235.236.237";
    InetAddress iadr = InetAddress.getByName(ip);
    MulticastSocket socket = new MulticastSocket();
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JButton sendButton = new JButton("Skicka");
    JTextField textField = new JTextField(20);
    JLabel nameLabel;

    public Sender(String name, int x, int y) throws IOException {
        Thread thread = new Thread(this);
        thread.start();
        nameLabel = new JLabel(name);
        northPanel.add(nameLabel);
        northPanel.add(textField);
        southPanel.add(sendButton);
        textField.addActionListener(this);
        sendButton.addActionListener(this);
        setLayout(new BorderLayout());
        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);

        setVisible(true);
        pack();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocation(x, y);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                thread.interrupt();
                System.out.println(thread.getName() + ":s window closes");
                //System.out.println(thread.getName() + " interrupted = " + thread.isInterrupted());
                e.getWindow().dispose();
            }
        });
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                //Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().getName() + " interrupted");
                System.out.println(Thread.currentThread().getName() + ": interrupted = " + Thread.currentThread().isInterrupted());
            }
            System.out.println(Thread.currentThread().getName() + " running");
        }
        System.out.println("End of run for " + Thread.currentThread().getName());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = (nameLabel.getText() + ": " + textField.getText() + "\n");
        data = message.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, iadr, port);
        try {
            socket.send(packet);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        textField.setText("");
    }

}