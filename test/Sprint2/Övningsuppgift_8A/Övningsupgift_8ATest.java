package Sprint2.Övningsuppgift_8A;

import Sprint2.Övninguppgift_8A.Övningsuppgift8A;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Övningsupgift_8ATest {

    Övningsuppgift8A test = new Övningsuppgift8A();

    @Test
    public void checkMinTest() {
        test.checkMin(20);
        test.checkMin(15.5);
        assertTrue(test.checkMin(16.7) == 15.5);

    }

    @Test
    public void checkMaxTest() {
        test.checkMax(25);
        test.checkMax(20.5);
        assertTrue(test.checkMax(13.7) == 25);

    }

    @Test
    public void addSummaTest() {
        test.addSumma(10);
        test.addSumma(2.5);
        assertTrue(test.addSumma(10) == 22.5);
    }

    @Test
    public void caculateAverageTest() {
        test.setAntalMätningar(20);
        test.addSumma(100);
        assertTrue(test.calculateAverage() == 5);
    }

    @Test
    public void mainProgramTest1() {
        String error = "./test.data";
        Throwable exception = assertThrows(FileNotFoundException.class,
                () -> test.mainProgram(error));
    }

    @Test
    public void mainProgramTest2() {
        String error = "./test.data";
        Throwable exception = assertThrows(IOException.class,
                () -> test.mainProgram(error));
    }

    @Test
    public void mainProgramTest3() {
        String error = "./test.data";
        Throwable exception = assertThrows(Exception.class,
                () -> test.mainProgram(error));
    }
}