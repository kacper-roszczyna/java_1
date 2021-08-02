package pl.roszczyna.teaching.flow_control;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Given an instance of magical power calculator")
class AdvancedTest {

    private final Advanced calculator = new Advanced();

    @Nested
    @DisplayName("When calculating power levels")
    class WhenCalculate {

        @Test
        @DisplayName("Then null has power 0")
        public void thenNull() {
            assertEquals(0, calculator.calculatePower(null));
        }

        @Test
        @DisplayName("Then empty has power 0")
        public void thenEmpty() {
            assertEquals(0, calculator.calculatePower(""));
        }

        @Test
        @DisplayName("Then Griffon has power 1")
        public void thenGriffon() {
            assertEquals(1, calculator.calculatePower("Griffon"));
        }

        @Test
        @DisplayName("Then Mighty Griffon has power 53")
        public void thenMightyGriffon() {
            assertEquals(53, calculator.calculatePower("Mighty Griffon"));
        }

        @Test
        @DisplayName("Then Sexy Racoon God of Might and Magic has power 9078")
        public void thenSexyRacoonGod() {
            assertEquals(9078, calculator.calculatePower("Sexy Racoon God of Might and Magic"));
        }

    }

}