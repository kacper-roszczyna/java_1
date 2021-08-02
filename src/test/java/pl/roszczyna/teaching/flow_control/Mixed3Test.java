package pl.roszczyna.teaching.flow_control;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Given an instance of Students counter")
class Mixed3Test {

    private final Mixed3 studentsCounter = new Mixed3();

    @Nested
    @DisplayName("When counting students of A before K")
    class WhenCounting {

        @Test
        @DisplayName("Then for no list expect 0")
        public void onNull() {
            assertEquals(0, studentsCounter.countStudentsStartingWithABeforeStudentWithK(null));
        }

        @Test
        @DisplayName("Then for empty list expect 0")
        public void onEmpty() {
            assertEquals(0, studentsCounter.countStudentsStartingWithABeforeStudentWithK(List.of()));
        }

        @Test
        @DisplayName("Then for no As before Ks expect 0")
        public void onTooLate() {
            assertEquals(0, studentsCounter.countStudentsStartingWithABeforeStudentWithK(List.of("Kacper Roszczyna", "Agatsuma Zenitsu")));
        }

        @Test
        @DisplayName("Then for no As at all expect 0")
        public void onMissing() {
            assertEquals(0, studentsCounter.countStudentsStartingWithABeforeStudentWithK(List.of("Tanjiro Kamodo", "Innosuke Hashibara")));
        }

        @Test
        @DisplayName("Then for Albreht Hohenzolern, Albert Einstein, Adam, Kacper Roszczyna, Agatsuma Zenitsu expect 3")
        public void onCount() {
            assertEquals(3, studentsCounter.countStudentsStartingWithABeforeStudentWithK(
                    List.of("Albreht Hohenzolern", "Albert Einstein", "Adam", "Kacper Roszczyna", "Agatsuma Zenitsu"))
            );
        }

    }

}