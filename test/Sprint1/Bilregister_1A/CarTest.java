package Sprint1.Bilregister_1A;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Carowner bengt = new Carowner("Bengt", "Götgatan 2", 41);
    Carowner majken = new Carowner("Majken", "Sibeliusvägen 14", 52);
    Car volvo = new Car("Volvo", "V40", "TBT 186");
    Car mazda = new Car("Mazda", "ZF4", "UBN 988");

    @Test
    void setOwner() {
        Carowner oldValue = bengt;
        Carowner newValue = majken;
        volvo.setOwner(oldValue);
        volvo.setOwner(newValue);
        Carowner expectedValue = newValue;
        Carowner expectedErrorValue = oldValue;
        Carowner actualValue = volvo.getOwner();
        Assertions.assertEquals(expectedValue, actualValue);
        Assertions.assertNotEquals(expectedErrorValue, actualValue);
    }
}