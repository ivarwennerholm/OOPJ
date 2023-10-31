package Sprint3.Uppgift_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adapter extends JFrame {
    JButton knapp = new JButton("Tryck");

    Adapter() {
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                knapp.setBackground(Color.RED);
            }
        };
        knapp.addActionListener(l);
        add(knapp);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Adapter main = new Adapter();
    }
}
