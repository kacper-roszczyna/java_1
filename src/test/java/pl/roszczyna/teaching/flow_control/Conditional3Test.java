package pl.roszczyna.teaching.flow_control;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Given an instance of calculator of creature power")
class Conditional3Test {

    private final Conditional3 creaturePowerCalculator = new Conditional3();

    @Nested
    @DisplayName("When calculating creature power")
    class WhenCalculate {

        @Test
        @DisplayName("Then null has power 0")
        public void thenNull() {
            assertEquals(0, creaturePowerCalculator.calculate(null));
        }

        @Test
        @DisplayName("Then empty has power 0")
        public void thenEmpty() {
            assertEquals(0, creaturePowerCalculator.calculate(""));
        }

        @Test
        @DisplayName("Then Griffon has power 1")
        public void thenGriffon() {
            assertEquals(1, creaturePowerCalculator.calculate("Griffon"));
        }

        @Test
        @DisplayName("Then Mighty Griffon has power 2")
        public void thenMightyGriffon() {
            assertEquals(2, creaturePowerCalculator.calculate("Mighty Griffon"));
        }

        @Test
        @DisplayName("Then Sexy Racoon God of Might and Magic has power 9006")
        public void thenSexyRacoonGod() {
            assertEquals(9006, creaturePowerCalculator.calculate("Sexy Racoon God of Might and Magic"));
        }

    }

}