package Sprint3.Övningsuppgift_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bensinförbrukning extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JTextField mätarställningDåTextField = new JTextField();

    JTextField mätarställningNuTextField = new JTextField();

    JTextField literBensinTextField = new JTextField();
    JLabel mätarställningDåJLabel = new JLabel("Ange mätarställning för ett år sedan:");
    JLabel mätarställningNuJLabel = new JLabel("Ange mätarställning idag:");
    JLabel literBensinJLabel = new JLabel("Ange liter förbrukad bensin:");
    JLabel resultatJLabel = new JLabel("RESULTAT");

    JButton button = new JButton("Beräkna");

    Bensinförbrukning() {
        panel.add(mätarställningDåJLabel);
        panel.add(mätarställningDåTextField);
        panel.add(mätarställningNuJLabel);
        panel.add(mätarställningNuTextField);
        panel.add(literBensinJLabel);
        panel.add(literBensinTextField);
        panel.add(button);
        panel.add(resultatJLabel);
        panel.setLayout(new GridLayout(4, 2));
        add(panel);
        button.addActionListener(this);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Bensinförbrukning bf = new Bensinförbrukning();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            //String mätarställningDå = mätarställningDåTextField.getText();
            int mätarställningDå = Integer.parseInt(mätarställningDåTextField.getText());
            int mätarställningNu = Integer.parseInt(mätarställningNuTextField.getText());
            int bensinförbrukning = Integer.parseInt(literBensinTextField.getText());
            int kördaMil = mätarställningNu + mätarställningDå;
            double literBensinPerMil = bensinförbrukning / kördaMil;
            resultatJLabel.setText("Kört: " + kördaMil + " mil " +
                    "Liter bensin per mil: " + literBensinPerMil);
        }

    }
}
