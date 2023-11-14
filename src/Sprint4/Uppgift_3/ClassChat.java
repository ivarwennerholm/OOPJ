package Sprint4.Uppgift_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.*;

public class ClassChat extends JFrame implements Runnable {
    String ip = "234.235.236.237";
    int port = 12540;
    InetAddress iadr = InetAddress.getByName(ip);
    InetSocketAddress group = new InetSocketAddress(iadr, port);
    NetworkInterface netif = NetworkInterface.getByName("wlan 2");
    MulticastSocket socket = new MulticastSocket(port);
    JPanel panel = new JPanel();
    JTextArea textArea = new JTextArea(25, 25);
    JScrollPane scrollPane = new JScrollPane(textArea);

    public static class ClassChatExit extends JFrame {
        JPanel exitPanel = new JPanel();
        JButton exitButton = new JButton("Avsluta");

        public ClassChatExit(int x, int y) {
            exitPanel.add(exitButton);
            exitButton.addActionListener(e -> System.exit(0));

            add(exitPanel);
            pack();
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocation(x, y);

        }
    }

    public ClassChat(int x, int y) throws IOException {
        Thread thread = new Thread(this);
        thread.start();

        textArea.setLineWrap(true);
        panel.add(scrollPane);

        add(panel);
        setVisible(true);
        pack();
        setLocation(x, y);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println(thread.getName() + "'s window closed");
                thread.interrupt();
                System.out.println(thread.getName() + " interrupted");
                System.out.println(thread.getName() + ": interrupted = " + thread.isInterrupted());
                e.getWindow().dispose();
            }
        });
    }

    public static void main(String[] args) throws IOException {
        ClassChat cc1 = new ClassChat(0, 0);
        ClassChat cc2 = new ClassChat(250, 0);
        ClassChat cc3 = new ClassChat(500, 0);
        ClassChat.ClassChatExit cce = new ClassChat.ClassChatExit(815, 375);
        Sender s1 = new Sender("Kattis", 750, 0);
        Sender s2 = new Sender("Ludde", 750, 125);
        Sender s3 = new Sender("Babben", 750, 250);
    }

    @Override
    public void run() {
        try {
            socket.joinGroup(group, netif);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (!Thread.interrupted()) {
            try {
                /*for (int i = 0; i <= 10; i++) {
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName() + " running");
                }*/
                byte[] data = new byte[256];
                DatagramPacket packet = new DatagramPacket(data, data.length);
                socket.receive(packet);
                String message = new String(packet.getData(), 0, packet.getLength());
                textArea.append(message);
                textArea.revalidate();
                textArea.repaint();
            } catch (IOException e) {
                System.out.println("catch-block för " + Thread.currentThread().getName() + " (IOExc)");
                break;
            } /*catch (InterruptedException e) {
                System.out.println("catch-block för " + Thread.currentThread().getName() + " (InterruptedExc");
                break;
            }*/
            //if (!Thread.currentThread().isInterrupted())
            //    Thread.currentThread().interrupt();
            //System.out.println(Thread.currentThread().getName() + " interrupted = " + Thread.currentThread().isInterrupted());
            System.out.println("End of run for " + Thread.currentThread().getName());
        }
    }

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}