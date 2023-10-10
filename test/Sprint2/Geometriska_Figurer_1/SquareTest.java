package Sprint2.Geometriska_Figurer_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {

    Square square = new Square(3, 2);

    @Test
    void getAreaTest() {
        double expectedValue = 6;
        double actualValue = square.getArea();
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void getCircumferenceTest() {
        double expectedValue = 10;
        double actualValue = square.getCircumference();
        Assertions.assertEquals(expectedValue, actualValue);
    }
}
