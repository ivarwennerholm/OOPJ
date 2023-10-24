package Sprint3.test;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame{

    JPanel panel = new JPanel();
    ImageIcon icon = new ImageIcon("./src/Övningsuppgift_1A/bild.jpg");
    JLabel label = new JLabel(icon);


    Test() {
        setLayout(new FlowLayout());
        add(panel);
        panel.add(label);
        setLocation(1000, 500);
        setSize(600, 600);
        //pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Test g = new Test();

    }

}
