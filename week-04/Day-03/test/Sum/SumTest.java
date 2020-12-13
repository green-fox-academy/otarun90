package Sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    private Sum sumTest;

    @BeforeEach
    public void setup() {
        sumTest = new Sum();
    }

    @Test
    public void testSumOfEmptyArrayIs0() {
        // 2. Act
        sumTest.sum(Collections.emptyList());

        // 3. Assert
        assertEquals(0, sumTest.sum(Collections.emptyList()));
    }

    @Test
    public void testSumOfArrayWithOneElementIsTheElement() {
        // 2. Act
        sumTest.sum(Arrays.asList(1));

        // 3. Assert
        assertEquals(1, sumTest.sum(Arrays.asList(1)));
    }

    @Test
    public void testSumOfArrayWithMoreThanOneElementsIsTheElement() {
        // 2. Act
        sumTest.sum(Arrays.asList(1,4,5));

        // 3. Assert
        assertEquals(10, sumTest.sum(Arrays.asList(1,4,5)));
    }
    @Test
    public void testSumOfNullIs0() {
        // 2. Act
        sumTest.sum(null);

        // 3. Assert
        assertEquals(0, sumTest.sum(null));
    }


}