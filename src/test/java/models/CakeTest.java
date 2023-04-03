package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CakeTest {
    Cake cake;

    @BeforeEach
    public void before(){
        cake = new Cake();
    }

    @Test
    public void testSetFlavor() {
        String expected = "Black forest";

        cake.setFlavor(expected);

        Assertions.assertEquals(expected, cake.getFlavor());
    }

    @Test
    public void testSetId() {
        int expected = 1;

        cake.setId(expected);

        Assertions.assertEquals(expected, cake.getId());
    }

    @Test
    public void testSetTiers() {
        int expected = 1;

        cake.setTiers(expected);

        Assertions.assertEquals(expected, cake.getTiers());
    }

    @Test
    public void testSetQty() {
        int expected = 1;

        cake.setQty(expected);

        Assertions.assertEquals(expected, cake.getQty());
    }

    @Test
    public void testSetPrice() {
        float expected = 1;

        cake.setPrice(expected);

        Assertions.assertEquals(expected, cake.getPrice());
    }

    @Test
    void testConstructor() {
        int expectedID = 1;
        String expectedFlavor = "lemon";
        int expectedTiers = 3;
        int expectedQty = 2;
        float expectedPrice = 30.0f; //I have no clue how much cakes should cost, lol


        Cake testCake = new Cake(expectedID, expectedFlavor, expectedTiers, expectedQty, expectedPrice);

        Assertions.assertEquals(expectedID, testCake.getId());
        Assertions.assertEquals(expectedFlavor, testCake.getFlavor());
        Assertions.assertEquals(expectedTiers, testCake.getTiers());
        Assertions.assertEquals(expectedQty, testCake.getQty());
        Assertions.assertEquals(expectedPrice, testCake.getPrice());
    }
}
