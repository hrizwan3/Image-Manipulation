package org.cis120;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Use this file to test your implementation of Pixel.
 * 
 * We will manually grade this file to give you feedback
 * about the completeness of your test cases.
 */

public class MyPixelTest {

    /*
     * Remember, UNIT tests should ideally have one point of failure. Below we
     * give you two examples of unit tests for the Pixel constructor, one that
     * takes in three ints as arguments and one that takes in an array. We use
     * the getRed(), getGreen(), and getBlue() methods to check that the values
     * were set correctly. These two tests do not comprehensively test all of
     * Pixel so you must add your own.
     * 
     * You might want to look into assertEquals, assertTrue, assertFalse, and
     * assertArrayEquals at the following:
     * http://junit.sourceforge.net/javadoc/org/junit/Assert.html
     *
     * Note, if you want to add global variables so that you can reuse Pixels
     * in multiple tests, feel free to do so.
     */

    @Test
    public void testConstructInBounds() {
        Pixel p = new Pixel(40, 50, 60);
        assertEquals(40, p.getRed());
        assertEquals(50, p.getGreen());
        assertEquals(60, p.getBlue());
    }

    @Test
    public void testConstructArrayLongerThan3() {
        int[] arr = { 10, 20, 30, 40 };
        Pixel p = new Pixel(arr);
        assertEquals(10, p.getRed());
        assertEquals(20, p.getGreen());
        assertEquals(30, p.getBlue());
    }


    /* ADD YOUR OWN TESTS BELOW */
    @Test
    public void testConstructorArrayLessThan3AndNotInvariant() {
        int[] arr = { -1, 260};
        Pixel p = new Pixel(arr);
        assertEquals(0, p.getRed());
        assertEquals(255, p.getGreen());
        assertEquals(0, p.getBlue());
    }

    @Test
    public void testGetComponents() {
        int[] arr = {2, 3, 4};
        Pixel p = new Pixel(arr);
        assertArrayEquals(p.getComponents(), arr);
    }

    @Test
    public void testDistance() {
        int[] arr1 = {2, 3, 4};
        int[] arr2 = {3, 4, 5};
        Pixel p = new Pixel(arr1);
        Pixel q = new Pixel(arr2);
        assertEquals(p.distance(q), 3);
    }

    @Test
    public void testSameRGB() {
        int[] arr1 = {2, 3, 4};
        int[] arr2 = {3, 4, 5};
        Pixel p = new Pixel(arr1);
        Pixel q = new Pixel(arr2);
        assertFalse(p.sameRGB(q));
    }
}
