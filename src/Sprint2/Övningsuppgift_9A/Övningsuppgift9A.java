package Sprint2.Övningsuppgift_9A;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Övningsuppgift9A {

    Scanner scan;
    BufferedReader inputReader;

    public static void main(String[] args) {
        Övningsuppgift9A övn = new Övningsuppgift9A();
        Path filePath = Paths.get("./src/personuppgifter.txt");
        String filePathString = "./src/personuppgifter.txt";
        System.out.println("Filen finns = " + övn.isFileReadable(filePath));
        övn.createScanner(filePathString);
        System.out.println(övn.scan.nextLine());
        //System.out.println(övn.scan.next() + " " + övn.scan.next());
    }

    public Path readInputFilePath(String test) {
        String inputFilePathString;
        if (test == null)
            inputFilePathString = JOptionPane.showInputDialog(null, "Fil att läsa in:");
        else
            inputFilePathString = JOptionPane.showInputDialog(null, test);

        return Paths.get(inputFilePathString);
    }

    public Path readOutputFilePath(String test) {
        String outputFilePathString;
        if (test == null)
            outputFilePathString = JOptionPane.showInputDialog(null, "Fil att skriva till:");
        else
            outputFilePathString = JOptionPane.showInputDialog(null, test);
        return Paths.get(outputFilePathString);
    }

    public boolean isFileReadable(Path filePath) {
        return Files.isReadable(filePath);
    }

    public boolean isFileWritable(Path filePath) {
        return Files.isWritable(filePath);
    }

    public BufferedReader createBufferedReader(String filePath) {
        try (BufferedReader inputReader = new BufferedReader(new FileReader(filePath))){
            System.out.println("Filen hittades"); // TEST
        } catch(FileNotFoundException e){
            System.out.println("Filen hittades inte");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
        return inputReader;
    }

    public void createScanner(String filePath) {
        this.scan = new Scanner(filePath);
        System.out.println("Scannern skapad!");
    }

    public String läsInNamn() {
        String namn = (this.scan.next() + " " + this.scan.next());
        this.scan.nextLine();
        return namn;
    }
}
