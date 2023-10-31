package Sprint3.Uppgift_4;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PrinterException;
import java.io.*;
import java.awt.event.*;

public class TextEditor extends JFrame implements ActionListener {

    JPanel mainPanel = new JPanel();
    JPanel topPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    JLabel textLabel = new JLabel("Filnamn:");
    JTextField textField = new JTextField(25);
    JButton openButton = new JButton("Öppna");
    JButton saveButton = new JButton("Spara");
    JButton printButton = new JButton("Skriv ut");
    JButton quitButton = new JButton("Avsluta");
    JTextArea textArea = new JTextArea(25, 80);
    JScrollPane scrollPane = new JScrollPane(textArea);

    TextEditor() {
        // TOP PANEL
        topPanel.setLayout(new FlowLayout());
        topPanel.add(textLabel);
        textField.setFont(new Font("Monospaced", Font.PLAIN, 12));
        topPanel.add(textField);
        topPanel.add(openButton);
        topPanel.add(saveButton);
        topPanel.add(printButton);
        topPanel.add(quitButton);

        // BOTTOM PANEL
        bottomPanel.setLayout(new FlowLayout());
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        bottomPanel.add(scrollPane);

        // MAIN PANEL
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        // JFRAME
        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // ACTION LISTENER
        textField.addActionListener(this);
        openButton.addActionListener(this);
        saveButton.addActionListener(this);
        printButton.addActionListener(this);
        quitButton.addActionListener(this);
    }

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
    }

    public void writeToFile(String filePath) {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            textArea.write(fileWriter);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "FEL: I/O för filen " + filePath);
        }
    }

    public void readFilePath(String filePath) {
        try (FileReader fileReader = new FileReader(filePath)) {
            textArea.read(fileReader, null);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "FEL: hittar inte filen " + filePath);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "FEL: I/O för filen " + filePath);
        }
    }

    public void print() {
        try {
            textArea.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "FEL: PrinterException");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String filePath = textField.getText();
        if (e.getSource() == openButton || e.getSource() == textField) {
            readFilePath(filePath);
        } else if (e.getSource() == saveButton) {
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
            print();
        } else
            System.exit(0);
    }

}