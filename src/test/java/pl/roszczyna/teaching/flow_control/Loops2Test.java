package pl.roszczyna.teaching.flow_control;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Given an object counting up to X")
class Loops2Test {

    private final Loops2 counter = new Loops2();

    @Nested
    @DisplayName("When counting up")
    class WhenCounting {

        @Test
        @DisplayName("On 0 return empty list")
        public void onZero() {
            assertEquals(List.of(), counter.generateCountUp(0));
        }

        @Test
        @DisplayName("On 5 return list: 1, 2, 3, 4, 5")
        public void onFive() {
            assertEquals(List.of(1, 2, 3, 4, 5), counter.generateCountUp(5));
        }

    }

}