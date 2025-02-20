package org.example.TD3;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;
import java.util.Map;

class StudentGradesTest {

    @Test
    void verifierLaNotePourUnePersonne() {
        Map<String, Integer> grades = StudentGrades.getGrades();
        assertThat(grades).containsEntry("Alice", 18);
    }

    @Test
    void verifierMoyennePourUnePersonne() {
        Map<String, Integer> grades = StudentGrades.getGrades();
        assertThat(grades.get("Bob")).isGreaterThan(10);
    }

    @Test
    void verifierNombreElement() {
        Map<String, Integer> grades = StudentGrades.getGrades();
        assertThat(grades).hasSize(3);
    }
}
