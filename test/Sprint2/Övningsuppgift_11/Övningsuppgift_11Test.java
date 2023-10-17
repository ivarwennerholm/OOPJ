package Sprint2.Övningsuppgift_11;

import Sprint2.Övningsuppgift11.Videoband;
import Sprint2.Övningsuppgift11.Övningsuppgift_11;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Övningsuppgift_11Test {

    Övningsuppgift_11 övn = new Övningsuppgift_11();
    Videoband videoband = new Videoband(240);

    @Test
    public void VideoBandTest() {
        int expectedValue = 240;
        int expectedErrorValue = 100;
        int actualValue = videoband.getBandetsLängd();
        Assertions.assertEquals(expectedValue, actualValue);
        Assertions.assertNotEquals(expectedErrorValue, actualValue);
    }

    @Test
    public void inspelatPåBandetTest() {
        int expectedValue = 140;
        int expectedErrorValue = 100;
        videoband.inspelatPåBand(100);
        int actualValue = videoband.getMinuterKvar();
        Assertions.assertEquals(expectedValue, actualValue);
        Assertions.assertNotEquals(expectedErrorValue, actualValue);
    }
}
