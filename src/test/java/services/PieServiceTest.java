package services;

import models.Pie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PieServiceTest {

    @Test
    void createTest() {
        String expectedFlavor = "lemon";
        float expectedCircumference = 3;
        int expectedQty = 2;
        float expectedPrice = 30.0f;

        PieService service = new PieService();
        Pie testPie = service.create(expectedFlavor, expectedCircumference, expectedQty, expectedPrice);

        Assertions.assertEquals(expectedFlavor, testPie.getFlavor());
        Assertions.assertEquals(expectedCircumference, testPie.getCircumference());
        Assertions.assertEquals(expectedQty, testPie.getQty());
        Assertions.assertEquals(expectedPrice, testPie.getPrice());
    }

    @Test
    void findAllTest() {
        Pie[] result = new Pie[1];
        String expectedFlavor = "lemon";
        float expectedCircumference = 3;
        int expectedQty = 2;
        float expectedPrice = 30.0f;

        PieService service = new PieService();
        result[0] = service.create(expectedFlavor, expectedCircumference, expectedQty, expectedPrice);

        Assertions.assertArrayEquals(result, service.findAll());
    }

    @Test
    void findTest() {
        String expectedFlavor = "lemon";
        float expectedCircumference = 3;
        int expectedQty = 2;
        float expectedPrice = 30.0f;

        PieService service = new PieService();
        Pie testPie = service.create(expectedFlavor, expectedCircumference, expectedQty, expectedPrice);
        int id = testPie.getId();

        Assertions.assertEquals(testPie, service.find(id));
    }

    @Test
    void deleteTest() {
        String expectedFlavor = "lemon";
        float expectedCircumference = 3;
        int expectedQty = 2;
        float expectedPrice = 30.0f;

        PieService service = new PieService();
        Pie testPie = service.create(expectedFlavor, expectedCircumference, expectedQty, expectedPrice);
        int id = testPie.getId();

        Assertions.assertTrue(service.delete(id));
    }

    @Test
    void deleteTest2() {
        int badID = 1000; //this is faster than writing a new create lol
        String expectedFlavor = "lemon";
        float expectedCircumference = 3;
        int expectedQty = 2;
        float expectedPrice = 30.0f;

        PieService service = new PieService();
        Pie testPie = service.create(expectedFlavor, expectedCircumference, expectedQty, expectedPrice);

        Assertions.assertFalse(service.delete(badID));
    }
}
