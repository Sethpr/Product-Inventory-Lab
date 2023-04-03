package services;

import models.Cake;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CakeServiceTest {
    @Test
    void createTest() {
        String expectedFlavor = "lemon";
        int expectedTiers = 3;
        int expectedQty = 2;
        float expectedPrice = 30.0f;

        CakeService service = new CakeService();
        Cake testCake = service.create(expectedFlavor, expectedTiers, expectedQty, expectedPrice);

        Assertions.assertEquals(expectedFlavor, testCake.getFlavor());
        Assertions.assertEquals(expectedTiers, testCake.getTiers());
        Assertions.assertEquals(expectedQty, testCake.getQty());
        Assertions.assertEquals(expectedPrice, testCake.getPrice());
    }

    @Test
    void findAllTest() {
        Cake[] result = new Cake[1];
        String expectedFlavor = "lemon";
        int expectedTiers = 3;
        int expectedQty = 2;
        float expectedPrice = 30.0f;

        CakeService service = new CakeService();
        result[0] = service.create(expectedFlavor, expectedTiers, expectedQty, expectedPrice);

        Assertions.assertArrayEquals(result, service.findAll());
    }

    @Test
    void findTest() {
        String expectedFlavor = "lemon";
        int expectedTiers = 3;
        int expectedQty = 2;
        float expectedPrice = 30.0f;

        CakeService service = new CakeService();
        Cake testCake = service.create(expectedFlavor, expectedTiers, expectedQty, expectedPrice);
        int id = testCake.getId();

        Assertions.assertEquals(testCake, service.find(id));
    }

    @Test
    void deleteTest() {
        String expectedFlavor = "lemon";
        int expectedTiers = 3;
        int expectedQty = 2;
        float expectedPrice = 30.0f;

        CakeService service = new CakeService();
        Cake testCake = service.create(expectedFlavor, expectedTiers, expectedQty, expectedPrice);
        int id = testCake.getId();

        Assertions.assertTrue(service.delete(id));
    }

    @Test
    void deleteTest2() {
        int badID = 1000; //this is faster than writing a new create lol
        String expectedFlavor = "lemon";
        int expectedTiers = 3;
        int expectedQty = 2;
        float expectedPrice = 30.0f;

        CakeService service = new CakeService();
        Cake testCake = service.create(expectedFlavor, expectedTiers, expectedQty, expectedPrice);

        Assertions.assertFalse(service.delete(badID));
    }
}
