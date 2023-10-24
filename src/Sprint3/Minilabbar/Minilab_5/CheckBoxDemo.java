package Sprint3.Minilabbar.Minilab_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxDemo extends JFrame implements ActionListener {
    private JPanel panel = new JPanel();
    private JCheckBox red = new JCheckBox("Röd", false);
    private JCheckBox blue = new JCheckBox("Blå", false);
    private JCheckBox yellow = new JCheckBox("Gul", false);
    private JLabel displayArea = new JLabel("NO COLOR");
    private boolean redIsSelected = false;
    private boolean blueIsSelected = false;
    private boolean yellowIsSelected = false;

    public CheckBoxDemo() {
        panel.add(red);
        panel.add(blue);
        panel.add(yellow);
        panel.add(displayArea);
        panel.setLayout(new GridLayout(4, 1));
        add(panel);
        red.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);
        setSize(120, 200);
        setLocationRelativeTo(null);
        //pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        CheckBoxDemo cbd = new CheckBoxDemo();
    }

    public void isPurple() {
        if (blueIsSelected && redIsSelected)
            displayArea.setText("PURPLE");
    }

    public void isBrown() {
        if (blueIsSelected && redIsSelected && yellowIsSelected)
            displayArea.setText("BROWN");
    }

    public void clearDisplayArea() {
        displayArea.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clearDisplayArea();
        if (e.getSource() == red) {
            if (!redIsSelected) {
                redIsSelected = true;
                red.setBackground(Color.red);
                displayArea.setText("RED");
            } else {
                redIsSelected = false;
                red.setBackground(null);
            }
            isPurple();
            isBrown();
        } else if (e.getSource() == blue) {
            if (!blueIsSelected) {
                blueIsSelected = true;
                blue.setBackground(Color.blue);
                displayArea.setText("BLUE");
            } else {
                blueIsSelected = false;
                blue.setBackground(null);
            }
            clearDisplayArea();
            isPurple();
            isBrown();
        } else if (!yellowIsSelected) {
            yellowIsSelected = true;
            yellow.setBackground(Color.yellow);
            displayArea.setText("YELLOW");
        } else {
            yellowIsSelected = false;
            yellow.setBackground(null);
        }
        isPurple();
        isBrown();
    }

}