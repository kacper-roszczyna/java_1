package pl.roszczyna.teaching.flow_control;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Given an instance of Countdown Generator")
class Loops1Test {

    private final Loops1 generator = new Loops1();

    @Nested
    @DisplayName("When starting timer")
    class WhenTimer {

        @Test
        @DisplayName("Then expect list of 5, 4, 3, 2, 1, -1 for countdown from 5")
        public void thenList() {
            assertEquals(List.of(5, 4, 3, 2, 1, -1), generator.generateCountdown(5));
        }

        @Test
        @DisplayName("Then expect list of -1 from countdown from 0")
        public void thenListEmpty() {
            assertEquals(List.of(-1), generator.generateCountdown(0));
        }

    }

}