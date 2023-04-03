package services;

import models.Cake;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CakeServiceTest {
    @Test
    void createTest() {
        int expectedID = 1;
        String expectedFlavor = "lemon";
        int expectedTiers = 3;
        int expectedQty = 2;
        float expectedPrice = 30.0f;

        CakeService service = new CakeService();
        Cake testCake = service.create(expectedFlavor, expectedTiers, expectedQty, expectedPrice);

        Assertions.assertEquals(expectedID, testCake.getId());
        Assertions.assertEquals(expectedFlavor, testCake.getFlavor());
        Assertions.assertEquals(expectedTiers, testCake.getTiers());
        Assertions.assertEquals(expectedQty, testCake.getQty());
        Assertions.assertEquals(expectedPrice, testCake.getPrice());
    }
}
