package pl.roszczyna.teaching.flow_control;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.util.comparator.Comparators;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Given an instance of a divisor finder")
class Loops3Test {

    private final Loops3 divisorFinder = new Loops3();

    @Nested
    @DisplayName("When finding divisors")
    class WhenDivisors {

        @Test
        @DisplayName("Then for negative numbers return empty list")
        public void thenOnNegative() {
            assertEquals(List.of(), divisorFinder.findDivisors(-6));
        }

        @Test
        @DisplayName("Then for 0 return empty list")
        public void thenOnZero() {
            assertEquals(List.of(), divisorFinder.findDivisors(0));
        }

        @Test
        @DisplayName("Then for 6 return list containing 1, 2, 3, 6")
        public void thenOnSix() {
            var res = divisorFinder.findDivisors(6);
            Collections.sort(res);
            assertEquals(List.of(1, 2, 3, 6), res);
        }

        @Test
        @DisplayName("Then for 4 return list containing 1, 2, 4")
        public void thenOnFour() {
            var res = divisorFinder.findDivisors(4);
            Collections.sort(res);
            assertEquals(List.of(1, 2, 4), res);
        }

        @Test
        @DisplayName("Then for 1 return list containing 1")
        public void thenOnOne() {
            var res = divisorFinder.findDivisors(1);
            Collections.sort(res);
            assertEquals(List.of(1), res);
        }

        @Test
        @DisplayName("Then for 3 return list containing 1, 3")
        public void thenOnThree() {
            var res = divisorFinder.findDivisors(3);
            Collections.sort(res);
            assertEquals(List.of(1, 3), res);
        }

        @Test
        @DisplayName("Then for 3 return list containing 1, 3")
        public void thenOnThree2() {
            var res = divisorFinder.findDivisors(100000000);
        }

    }

}