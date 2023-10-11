package Sprint2.Växel_TDD_6A;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class VäxelTest {
    Växel växel = new Växel();

    @Test
    public void beräknaVäxelTest() {
        int expectedValue = 400;
        int actualvalue = växel.beräknaVäxel(1000, 600);
        Assertions.assertEquals(expectedValue, actualvalue);
    }

    @Test
    public void felhanteringTest(){
        int noll = 0;
        int negativtTal = -5;
        int positivtTal = 5;
        assertTrue(växel.felhantering(noll).startsWith("Det blev ingen växel"));
        assertTrue(växel.felhantering(negativtTal).startsWith("Du lämnade för lite pengar"));
        assertNull(växel.felhantering(positivtTal));
    }

    @Test
    public final void läsIndataNoSuchElementExceptionTest(){
        växel.test = true;
        String error = "sfsfdsfs";
        Throwable exception = assertThrows(NoSuchElementException.class,
                () -> växel.läsIndata("", error));
    }

    @Test
    public final void läsIndataNoSuchElementExceptionTwoTest(){
        växel.test = true;
        String error = "";
        Throwable exception = assertThrows(NoSuchElementException.class,
                () -> växel.läsIndata("", error));
    }
    @Test
    public final void läsIndataExceptionTest(){
        växel.test = true;
        String error = null;
        Throwable exception = assertThrows(Exception.class,
                () -> växel.läsIndata("", error));
    }

    // FUNKAR EJ VARFÖR? ↓
    @Test
    public final void läsIndataInputMismatcExceptionTest(){
        växel.test = true;
        String error = "111.12";
        Throwable exception = assertThrows(InputMismatchException.class,
                () -> växel.läsIndata("", error));
    }

    @Test
    public final void läsIndataTest(){
        växel.test = true;
        String ok = "23";
        assertTrue(växel.läsIndata("Hej", ok) == 23);
        assertFalse(växel.läsIndata("Hej", ok) == 24);
    }
    @Test
    public void beräknaValörerTest() {
        String expectedValue1 = "[7, 1, 1, 1, 1, 1, 1, 1, 1, 1]";
        String expectedErrorValue1 = "[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]";
        String actualValue1 = Arrays.toString(växel.beräknaValörer(7888));
        String expectedValue2 = "[0, 1, 0, 0, 0, 0, 1, 0, 1, 0]";
        String expectedErrorValue2 = "[0, 0, 0, 0, 0, 0, 1, 0, 1, 0]";
        String actualValue2 = Arrays.toString(växel.beräknaValörer(512));
        Assertions.assertEquals(expectedValue1, actualValue1);
        Assertions.assertNotEquals(expectedErrorValue1, actualValue1);
        Assertions.assertEquals(expectedValue2, actualValue2);
        Assertions.assertNotEquals(expectedErrorValue2, actualValue2);
    }

    @Test
    public void skapaUtskriftTest() {
        String expectedValue = ("Antal 1000-sedlar: 1\n" +
                "Antal 500-sedlar: 1\n" +
                "Antal 200-sedlar: 1\n" +
                "Antal 100-sedlar: 1\n" +
                "Antal 50-sedlar: 1\n" +
                "Antal 20-sedlar: 1\n" +
                "Antal 10-kronor: 1\n" +
                "Antal 5-kronor: 1\n" +
                "Antal 2-kronor: 1\n" +
                "Antal 1-kronor: 1\n");
        String expectedErrorValue = ("Antal 1000-sedlar: 0\n" +
                "Antal 500-sedlar: 4\n" +
                "Antal 200-sedlar: 3\n" +
                "Antal 100-sedlar: 1\n" +
                "Antal 50-sedlar: 1\n" +
                "Antal 20-sedlar: 0\n" +
                "Antal 10-kronor: 1\n" +
                "Antal 5-kronor: 4\n" +
                "Antal 2-kronor: 1\n" +
                "Antal 1-kronor: 1\n");
        String actualValue = (växel.skapaUtskrift(växel.beräknaValörer(1888)));
        Assertions.assertEquals(expectedValue, actualValue);
        Assertions.assertNotEquals(expectedErrorValue, actualValue);
    }
}