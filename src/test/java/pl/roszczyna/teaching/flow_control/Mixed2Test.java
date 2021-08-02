package pl.roszczyna.teaching.flow_control;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Given an instance of second smallest number finder")
class Mixed2Test {

    private final Mixed2 secondSmallestFinder = new Mixed2();

    @Nested
    @DisplayName("When finding second smallest")
    class WhenSecondSmallest {

        @Test
        @DisplayName("For list shorter than two elements expect IllegalArgumentException")
        public void forShortListException() {
            assertThrows(IllegalArgumentException.class, () -> secondSmallestFinder.findSecondSmallest(List.of(1)));
        }

        @Test
        @DisplayName("For list 6, 3, 57, 1 expect 3")
        public void expect3() {
            assertEquals(3, secondSmallestFinder.findSecondSmallest(List.of(6, 3, 57, 1)));
        }


        @Test
        @DisplayName("For list 6, 3, -57, 1 expect 1")
        public void expect1() {
            assertEquals(1, secondSmallestFinder.findSecondSmallest(List.of(6, 3, -57, 1)));
        }

    }

}