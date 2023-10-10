package Sprint2.Bensinförbrukning_TDD_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BensinförbrukningTest {

    Bensinförbrukning bf = new Bensinförbrukning();

    @Test
    public void jämförMätarställningTest() {
        double mätarställning1 = 1000.55;
        double mätarställning2 = 1400.55;
        double expectedValue = 400;
        double actualValue = bf.jämförMätarställning(mätarställning2, mätarställning1);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void räknaUtFörbrukningPerMilTest() {
        double antalMil = 700;
        double förbrukning = 875;
        double expectedValue = 1.25;
        double actualValue = bf.räknaUtFörbrukningPerMil(förbrukning, antalMil);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void genereraUtskriftStringTest() {
        String expectedValue = "Antal körda mil: 500.0\nAntal liter bensin: 250.0\nFörbrukning per mil: 0.5";
        String expectedErrorValue = "Antal bilade mil: 400\nAntal dunkar bensin 400\bFörbrukning per km: 30";
        String actualValue = bf.genereraUtskriftString(500.0, 250.0, 0.5);
        Assertions.assertEquals(expectedValue, actualValue);
        Assertions.assertNotEquals(expectedErrorValue, actualValue);
    }

    @Test
    public void genereraUtskriftStringBuilderTest() {
        String expectedValue = "Antal körda mil: 500.0\nAntal liter bensin: 250.0\nFörbrukning per mil: 0.5";
        String expectedErrorValue = "Antal bilade mil: 400\nAntal dunkar bensin 400\bFörbrukning per km: 30";
        String actualValue = bf.genereraUtskriftStringBuilder(500.0, 250.0, 0.5).toString();
        Assertions.assertEquals(expectedValue, actualValue);
        Assertions.assertNotEquals(expectedErrorValue, actualValue);
    }
}
