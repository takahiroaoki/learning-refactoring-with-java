package com.example.chapter1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.StandardOutputTest;
import org.junit.jupiter.api.Test;

public class MainTest extends StandardOutputTest {
    @Test
    public void testMain() {
        // Expected
        String expected = getExpectedOutput(
            "Andrew walks.",
            "Andrew stops.",
            "Andrew jumps."
        );

        // Actual
        Main.main(new String[0]);
        String actual = getActualOutput();

        // Assert
        assertEquals(expected, actual);
    }
}
