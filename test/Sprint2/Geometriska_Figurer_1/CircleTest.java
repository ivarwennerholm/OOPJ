package Sprint2.Geometriska_Figurer_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    Circle circle = new Circle(5);

    @Test
    public void getCircumferenceTest() {
        double expectedValue = 31.41592653589793;
        double actualValue = circle.getCircumference();
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getAreaTest() {
        double expectedValue = 78.53981633974483;
        double actualValue = circle.getArea();
        Assertions.assertEquals(expectedValue, actualValue);
    }
}
