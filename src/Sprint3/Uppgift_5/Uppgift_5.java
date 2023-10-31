package Sprint3.Uppgift_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Uppgift_5 extends JFrame implements ActionListener {
    int playerWins = 0;
    int cpuWins = 0;
    Random random = new Random();
    JPanel westPanel = new JPanel();
    JPanel eastPanel = new JPanel();
    JPanel southPanel = new JPanel();

    JButton playerRock = new JButton("Rock");
    JButton playerPaper = new JButton("Paper");
    JButton playerScissor = new JButton("Scissor");
    JButton cpuRock = new JButton("Rock");
    JButton cpuPaper = new JButton("Paper");
    JButton cpuScissor = new JButton("Scissor");
    JLabel playerWinsText = new JLabel("Player wins:");
    JLabel playerWinsNumber = new JLabel(String.valueOf(playerWins));
    JLabel cpuWinsText = new JLabel("CPU wins:");
    JLabel cpuWinsNumber = new JLabel(String.valueOf(cpuWins));

    Uppgift_5() {
        add(westPanel, BorderLayout.WEST);
        add(eastPanel, BorderLayout.EAST);
        add(southPanel, BorderLayout.SOUTH);

        westPanel.setLayout(new GridLayout(3, 1));
        westPanel.add(playerRock);
        westPanel.add(playerPaper);
        westPanel.add(playerScissor);

        eastPanel.setLayout(new GridLayout(3, 1));
        eastPanel.add(cpuRock);
        eastPanel.add(cpuPaper);
        eastPanel.add(cpuScissor);

        southPanel.setLayout(new FlowLayout());
        southPanel.add(playerWinsText);
        southPanel.add(playerWinsNumber);
        southPanel.add(cpuWinsText);
        southPanel.add(cpuWinsNumber);

        playerRock.addActionListener(this);
        playerPaper.addActionListener(this);
        playerScissor.addActionListener(this);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        Uppgift_5 uppg5 = new Uppgift_5();
    }

    public void showCpuHand(int cpuHand) {
        if (cpuHand == 1) {
            cpuRock.setBackground(Color.red);
        } else if (cpuHand == 2) {
            cpuPaper.setBackground(Color.red);
        } else {
            cpuScissor.setBackground(Color.red);
        }
    }

    public void clearCpuHands() {
        cpuRock.setBackground(null);
        cpuPaper.setBackground(null);
        cpuScissor.setBackground(null);
    }

    public void clearPlayerHands() {
        playerRock.setBackground(null);
        playerPaper.setBackground(null);
        playerScissor.setBackground(null);
    }
    public void calculateResult(int playerHand, int cpuHand) {
        if (playerHand == 1) {
            if (cpuHand == 2) {
                cpuWins++;
            }
            else if (cpuHand == 3) {
                playerWins++;
            }
        } else if (playerHand == 2) {
            if (cpuHand == 1) {
                playerWins++;
            } else if (cpuHand == 3) {
                cpuWins++;
            }
        } else {
            if (cpuHand == 1) {
                cpuWins++;
            } else if (cpuHand == 2) {
                playerWins++;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clearCpuHands();
        clearPlayerHands();
        int playerHand;
        int cpuHand = random.nextInt(3) + 1;
        showCpuHand(cpuHand);
        if (e.getSource() == playerRock) {
            playerRock.setBackground(Color.green);
            playerHand = 1;
        } else if (e.getSource() == playerPaper) {
            playerPaper.setBackground(Color.green);
            playerHand = 2;
        } else {
            playerScissor.setBackground(Color.green);
            playerHand = 3;
        }
        calculateResult(playerHand, cpuHand);
        playerWinsNumber.setText(String.valueOf(playerWins));
        cpuWinsNumber.setText(String.valueOf(cpuWins));

    }
}
