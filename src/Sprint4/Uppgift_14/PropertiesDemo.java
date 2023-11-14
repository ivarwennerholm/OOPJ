package Sprint4.Uppgift_14;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo extends JFrame{

    public PropertiesDemo() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src/Sprint4/Uppgift_14/prop.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String mess = prop.getProperty("message");
        JLabel label = new JLabel(mess, JLabel.CENTER);
        String fontName = prop.getProperty("fontName", "SansSerif");
        String fontStyle = prop.getProperty("fontStyle", "BOLD");
        int fontSize = Integer.parseInt(prop.getProperty("fontSize", "25"));
        Font font;
        if (fontStyle.equals("BOLD"))
            font = new Font(fontName, Font.BOLD, fontSize);
        else if (fontStyle.equals("ITALIC"))
            font = new Font(fontName, Font.ITALIC, fontSize);
        else
            font = new Font(fontName, Font.PLAIN, fontSize);
        label.setFont(font);

        add(label);
        setVisible(true);
        setSize(200, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new PropertiesDemo();
    }
}
