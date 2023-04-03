package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PieTest {
    Pie pie;

    @BeforeEach
    public void before(){
        pie = new Pie();
    }

    @Test
    public void testSetFlavor() {
        String expected = "Black forest";

        pie.setFlavor(expected);

        Assertions.assertEquals(expected, pie.getFlavor());
    }

    @Test
    public void testSetId() {
        int expected = 1;

        pie.setId(expected);

        Assertions.assertEquals(expected, pie.getId());
    }

    @Test
    public void testSetCirc() {
        float expected = 1;

        pie.setCircumference(expected);

        Assertions.assertEquals(expected, pie.getCircumference());
    }

    @Test
    public void testSetQty() {
        int expected = 1;

        pie.setQty(expected);

        Assertions.assertEquals(expected, pie.getQty());
    }

    @Test
    public void testSetPrice() {
        float expected = 1;

        pie.setPrice(expected);

        Assertions.assertEquals(expected, pie.getPrice());
    }

    @Test
    void testConstructor() {
        int expectedID = 1;
        String expectedFlavor = "lemon";
        float expectedCircumference = 3;
        int expectedQty = 2;
        float expectedPrice = 30.0f; //I have no clue how much cakes should cost, lol


        Pie testCake = new Pie(expectedID, expectedFlavor, expectedCircumference, expectedQty, expectedPrice);

        Assertions.assertEquals(expectedID, testCake.getId());
        Assertions.assertEquals(expectedFlavor, testCake.getFlavor());
        Assertions.assertEquals(expectedCircumference, testCake.getCircumference());
        Assertions.assertEquals(expectedQty, testCake.getQty());
        Assertions.assertEquals(expectedPrice, testCake.getPrice());
    }
}
