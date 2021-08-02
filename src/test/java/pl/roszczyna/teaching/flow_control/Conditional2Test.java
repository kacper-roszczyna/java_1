package pl.roszczyna.teaching.flow_control;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Conditional2Test {


    @Nested
    @DisplayName("Given an instance of Warsaw -> Destination calculator")
    class GivenCalculator {

        private Conditional2 calculator = new Conditional2();

        @Nested
        @DisplayName("When travelling to Kraków")
        class WhenKrakow {

            @Test
            @DisplayName("Then expect appropriate distance")
            public void expectDistance() {
                assertEquals(230, calculator.getDistanceFromWarsawTo("Kraków"));
            }

        }

        @Nested
        @DisplayName("When travelling to Gdańsk")
        class WhenGdansk {

            @Test
            @DisplayName("Then expect appropriate distance")
            public void expectDistance() {
                assertEquals(320, calculator.getDistanceFromWarsawTo("Gdańsk"));
            }

        }

        @Nested
        @DisplayName("When travelling to Poznan")
        class WhenPoznan {

            @Test
            @DisplayName("Then expect appropriate distance")
            public void expectDistance() {
                assertEquals(430, calculator.getDistanceFromWarsawTo("Poznań"));
            }

        }

        @Nested
        @DisplayName("When travelling to the great beyond")
        class WhenGreatBeyond {

            @Test
            @DisplayName("Then expect appropriate distance")
            public void expectDistance() {
                assertEquals(-1, calculator.getDistanceFromWarsawTo("Nibylandia"));
            }

        }

    }

}