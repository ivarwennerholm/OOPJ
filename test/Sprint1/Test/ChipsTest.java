package Sprint1.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChipsTest {

    Chips chips = new Chips();
    @Test

    void getSugarContent() {
        int expectedSugarContent = 0;
        int actualSugarContent = chips.getSugarContent();
        Assertions.assertEquals(actualSugarContent, expectedSugarContent);
    }
}