package Apple;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
    private Apple apple = new Apple();

    @Test
    public void getError() {
        assertEquals("watermelon",apple.getApple());
    }

    @Test
    public void getApple() {
        assertEquals("Apple",apple.getApple());
    }
}