package Sprint3.Uppgift_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Uppgift_6 extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JButton button1 = new JButton("Knapp 1");
    JButton button2 = new JButton("Knapp 2");
    JTextField textField = new JTextField();

    public Uppgift_6() {
        WindowAdapter windowAdapter = new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                textField.requestFocus();
            }
        };

        FocusAdapter focusAdapter = new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                textField.setBackground(Color.BLUE);
            }
            @Override
            public void focusLost(FocusEvent e) {
                textField.setBackground(null);
            }
        };
        addWindowListener(windowAdapter);
        textField.addFocusListener(focusAdapter);
        add(panel);
        panel.setLayout(new GridLayout(3, 1));
        panel.add(button1);
        panel.add(button2);
        panel.add(textField);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Uppgift_6 uppg6 = new Uppgift_6();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
