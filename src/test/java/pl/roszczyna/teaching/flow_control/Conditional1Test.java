package pl.roszczyna.teaching.flow_control;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Conditional1Test {

    @Nested
    @DisplayName("Given 3, 4, 5 as numbers")
    class Of345 {
        Conditional1 cond = new Conditional1();
        int a = 5;
        int b = 4;
        int c = 3;

        @Nested
        @DisplayName("When getting minimum of three")
        class WhenMinOfThree {

            @Test
            @DisplayName("Then expect 3")
            public void expectMinimum() {
                assertEquals(3, cond.minOf3(a, b, c));
            }

        }
    }

}