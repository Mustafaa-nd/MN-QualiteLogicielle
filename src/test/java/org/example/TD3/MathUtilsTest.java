package org.example.TD3;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.TD2.MathUtils;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void verifierResultatDivision() {
        IllegalArgumentException thrown =
                assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(4, 0));
        assertThat(thrown).hasMessageThat().isEqualTo("Division par zéro !");
    }
}
