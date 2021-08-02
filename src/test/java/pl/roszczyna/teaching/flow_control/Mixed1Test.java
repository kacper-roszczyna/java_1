package pl.roszczyna.teaching.flow_control;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Given an instance of numbers counter")
class Mixed1Test {

    private final Mixed1 numbersCounter = new Mixed1();

    @Nested
    @DisplayName("When counting numbers")
    class WhenCount {

        @Test
        @DisplayName("Then in list 5, 5, 5 and number 5 return 3")
        public void thenIn555() {
            assertEquals(3, numbersCounter.count(List.of(5, 5, 5), 5));
        }

        @Test
        @DisplayName("Then in list 5, 4, 5 and number 4 return 1")
        public void thenIn545() {
            assertEquals(1, numbersCounter.count(List.of(5, 4, 5), 4));
        }

        @Test
        @DisplayName("Then in empty list and number 4 return 0")
        public void thenInEmpty() {
            assertEquals(0, numbersCounter.count(List.of(), 4));
        }

        @Test
        @DisplayName("Then in list 5, 4, 5 and number 3 return 0")
        public void thenInMissing() {
            assertEquals(0, numbersCounter.count(List.of(5, 4, 5), 3));
        }
    }

}