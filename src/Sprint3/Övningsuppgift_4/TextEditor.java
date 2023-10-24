package Sprint3.Övningsuppgift_4;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PrinterException;
import java.io.*;
import java.awt.event.*;

public class TextEditor extends JFrame implements ActionListener {

    JPanel mainPanel = new JPanel();
    JPanel topPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JLabel filePathJLabel = new JLabel("Filnamn:");
    JTextField filePathTextField = new JTextField(20);
    JButton openButton = new JButton("Öppna");
    JButton saveButton = new JButton("Spara");
    JButton printButton = new JButton("Skriv ut");
    JButton quitButton = new JButton("Avsluta");
    JTextArea textArea = new JTextArea(25, 66);
    JScrollPane scrollPane = new JScrollPane(textArea);

    TextEditor() {
        // TOP PANEL
        topPanel.setLayout(new FlowLayout());
        topPanel.add(filePathJLabel);
        topPanel.add(filePathTextField);
        topPanel.add(openButton);
        topPanel.add(saveButton);
        topPanel.add(printButton);
        topPanel.add(quitButton);

        // BOTTOM PANEL
        bottomPanel.setLayout(new FlowLayout());
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        bottomPanel.add(scrollPane);

        // MAIN PANEL
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        // GENERAL
        add(mainPanel);
        pack();
        setVisible(true);

        // ACTION LISTENER
        openButton.addActionListener(this);
        saveButton.addActionListener(this);
        printButton.addActionListener(this);
        quitButton.addActionListener(this);
    }

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
    }

    public void writeToFile(String filePath) {
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath))) {
            textArea.write(fileWriter);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "FEL: I/O för filen " + filePath);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String filePath;
        if (e.getSource() == openButton) {
            filePath = filePathTextField.getText();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
                textArea.read(fileReader, null);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "FEL: hittar inte filen " + filePath);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "FEL: I/O för filen " + filePath);
            }
        } else if (e.getSource() == saveButton) {
            filePath = filePathTextField.getText();
            File file = new File(filePath);
            String fileName = file.getName();
            int confirm;
            if (file.exists()) {
                confirm = JOptionPane.showConfirmDialog(null, "Filen '" + fileName + "' existerar redan, vill du skriva över den?", "Skriva över fil", JOptionPane.YES_NO_OPTION);
                if (confirm == 0)
                    writeToFile(filePath);
            } else {
                writeToFile(filePath);
            }
        } else if (e.getSource() == printButton) {
            try {
                textArea.print();
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, "FEL: PrinterException");
            }
        } else
            System.exit(0);
    }

}