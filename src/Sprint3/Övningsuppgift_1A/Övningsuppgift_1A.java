package Sprint3.Övningsuppgift_1A;

import javax.swing.*;
import java.awt.*;

public class Övningsuppgift_1A extends JFrame {

    JPanel panel = new JPanel();
    ImageIcon icon = new ImageIcon("./src/Sprint3/Övningsuppgift_1A/bild.jpg");
    JLabel label = new JLabel(icon);
    JButton button = new JButton("Tryck här");

    Övningsuppgift_1A() {
        setLayout(new FlowLayout());
        add(panel);
        panel.add(label);
        panel.add(button);
        setSize(600, 700);
        //pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Övningsuppgift_1A öu = new Övningsuppgift_1A();
    }

}
