package Sprint2.Geometriska_Figurer_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsoscelesTriangleTest {

    IsoscelesTriangle triangle = new IsoscelesTriangle(3, 5);

    @Test
    public void getAreaTest() {
        double expectedValue = 7.154544010627092;
        double actualValue = triangle.getArea();
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCircumferencetest() {
        double expectedValue = 13;
        double actualValue = triangle.getCircumference();
        Assertions.assertEquals(expectedValue, actualValue);
    }
}
