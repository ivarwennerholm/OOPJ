package Sprint3.Demos.ComponentsDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComponentsDemo extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JButton button1 = new JButton("01");
    JButton button2 = new JButton("02");
    JButton button3 = new JButton("03");
    JLabel label = new JLabel();
    ComponentsDemo() {
        add(panel);
        panel.setLayout(new GridLayout(2, 2));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(label);
        //button1.addActionListener(this);
        button2.addActionListener(this);
        //button3.addActionListener(this);

        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new ComponentsDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {

            //int index = panel.getComponentCount();
            //System.out.println("button1.getComponentCount = " + index);
            //panel.getComponent(0);
            //if (panel.getComponent(0) == null);

            //panel.remove(0);
            //panel.removeAll();
            //panel.remove(button1);
            //panel.revalidate();
            //panel.repaint();
        }
        else if (e.getSource() == button2) {
            panel.removeAll();
            panel.add(button1);
            panel.add(label);
            panel.add(button3);
            panel.add(button2);
            panel.revalidate();
            //panel.repaint();
            //int index = button2.getComponentCount();
            //System.out.println("button2.getComponentCount= " + index);
            //panel.getComponent(0);

            //if (panel.getComponent(0) == null);

            //panel.remove(0);
            //panel.removeAll();
            //panel.remove(button1);
            //panel.revalidate();
            //panel.repaint();
        }
        else if (e.getSource() == button3) {
            int index = button3.getComponentCount();
            System.out.println("button3.getComponentCount = " + index);

        }
    }
}
