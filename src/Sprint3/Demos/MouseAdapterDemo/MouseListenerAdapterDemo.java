package Sprint3.Demos.MouseAdapterDemo;

import javax.swing.*;

public class MouseListenerAdapterDemo extends JFrame {
    JPanel panel = new JPanel();
    JButton button = new JButton("Klicka");

    MouseListenerAdapterDemo() {
        add(panel);
        panel.add(button);
        button.addMouseListener(new MouseAdapterDemo());

        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new MouseListenerAdapterDemo();
    }
}
