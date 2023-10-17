package Sprint2.Övningsuppgift_13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class KalkylatorTest {

    Kalkylator test = new Kalkylator(true);

    @Test
    public void läsaHelaRadenTest() {
        test.skapaScanner("75 ? 100");
        String expectedValue = "75 ? 100";
        String expectedErrorValue = "75 + 125";
        String actualValue = test.getRaden();
        Assertions.assertEquals(expectedValue, actualValue);
        Assertions.assertNotEquals(expectedErrorValue, actualValue);
    }

    @Test
    public void läsInFörstaOperandTest() {
        test.skapaScanner("75 ? 100");
        int expectedValue = 75;
        int expectedErrorValue = 100;
        int actualValue = test.läsInFörstaOperand();
        Assertions.assertEquals(expectedValue, actualValue);
        Assertions.assertNotEquals(expectedErrorValue, actualValue);
    }

    @Test
    public void läsaInFörstaOperandInpuMismatchExceptionTest() {
        test.skapaScanner("abc - dfg");
        Throwable exception = assertThrows(InputMismatchException.class, () -> test.läsInFörstaOperand());

    }

    @Test
    public void OperatorNotSupportedException() {
        test.skapaScanner("75 ? 100");
        test.läsInFörstaOperand();
        Throwable exception = assertThrows(OperatorNotSupportedException.class, () -> test.läsInOperator());
    }

    @Test
    void läsInOperatorTest() throws OperatorNotSupportedException {
        test.skapaScanner("75 * 100");
        test.läsInFörstaOperand();
        char expectedValue = '*';
        char actualValue = test.läsInOperator();
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void läsInAndraOperandTest() throws OperatorNotSupportedException {
        test.skapaScanner("75 * 100");
        test.läsInFörstaOperand();
        test.läsInOperator();
        int expectedValue = 100;
        int expectedErrorValue = 75;
        int actualValue = test.läsInAndraOperand();
        Assertions.assertEquals(expectedValue, actualValue);
        Assertions.assertNotEquals(expectedErrorValue, actualValue);
    }

    @Test
    public void läsaInAndraOperandInpuMismatchExceptionTest() throws OperatorNotSupportedException {
        test.skapaScanner("123 - dfg");
        test.läsInFörstaOperand();
        test.läsInOperator();
        Throwable exception = assertThrows(InputMismatchException.class, () -> test.läsInAndraOperand());

    }
}
