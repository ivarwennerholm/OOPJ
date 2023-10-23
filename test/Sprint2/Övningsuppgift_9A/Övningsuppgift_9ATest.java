package Sprint2.Övningsuppgift_9A;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Övningsuppgift_9ATest {

    Övningsuppgift9A övn = new Övningsuppgift9A();

    @Test
    public void readInputFilePathTest() {
        String expected = "C:\\Users\\test\\file.txt";
        String expectedError = "D:\\User\\test\\file.nfo";
        String actual = övn.readInputFilePath("Skriv in \"C:\\Users\\test\\file.txt\": ").toString();
        Assertions.assertEquals(expected, actual);
        Assertions.assertNotEquals(expectedError, actual);
    }

    @Test
    public void readOutputFilePathTest() {
        String expected = "C:\\Users\\test\\file.txt";
        String expectedError = "D:\\User\\test\\file.nfo";
        String actual = övn.readOutputFilePath("Skriv in \"C:\\Users\\test\\file.txt\": ").toString();
        Assertions.assertEquals(expected, actual);
        Assertions.assertNotEquals(expectedError, actual);
    }

    @Test
    public void isFileReadableTest() {
        Path filePath = Paths.get("./src/personuppgifter.txt");
        boolean expected = true;
        boolean expectedError = false;
        boolean actual = övn.isFileReadable(filePath);
        Assertions.assertEquals(expected, actual);
        Assertions.assertNotEquals(expectedError, actual);
    }

    @Test
    public void isFileWritableTest() {
        Path filePath = Paths.get("./src/långapersoner.txt");
        boolean expected = true;
        boolean expectedError = false;
        boolean actual = övn.isFileWritable(filePath);
        Assertions.assertEquals(expected, actual);
        Assertions.assertNotEquals(expectedError, actual);

    }

    @Test
    public void läsInNamnTest() {
        //Path filePath = Paths.get("./src/personuppgifter.txt");
        //String filePath
        //övn.scan = övn.createScanner(filePath);
        //övn.inputReader = övn.createBufferedReader("./src/personuppgifter.txt");
        //System.out.print(övn.scan.next() + " " + övn.scan.next());
        /*String expected = "Kalle Nilsson";
        String expectedError = "Greta Thunberg";
        String actual = övn.läsInNamn();
        Assertions.assertEquals(expected, actual);
        Assertions.assertNotEquals(expectedError, actual);*/
    }
}