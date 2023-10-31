package Sprint3.Uppgift_1B;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class Övningsuppgift_1B extends JFrame implements ActionListener {
    List<String> imageFileNames = new ArrayList<String>();
    JPanel panel = new JPanel();
    Path imageDir = Paths.get("./src/Sprint3/Övningsuppgift_1B/bilder/");
    ImageIcon icon = new ImageIcon("./src/Sprint3/Övningsuppgift_1B/bilder/bild1.jpg");
    int imageIndex = 0;
    JLabel label = new JLabel(icon);
    JButton button = new JButton("Växla bild");

    Övningsuppgift_1B() {
        add(panel);
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.NORTH);
        panel.add(button, BorderLayout.SOUTH);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        Övningsuppgift_1B öu = new Övningsuppgift_1B();
        öu.loadImageNames(öu.imageDir);

    }

    protected List<String> loadImageNames(Path imageDir) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(imageDir)) {
            for (Path file : stream) {
                imageFileNames.add(file.toString());
                System.out.println(file);
            }
        } catch (IOException | DirectoryIteratorException ex) {
            ex.printStackTrace();
        }
        return imageFileNames;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String imagePath = imageFileNames.get(imageIndex++);
        icon = new ImageIcon(imagePath);
        label = new JLabel(icon);

    }
}
