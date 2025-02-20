package org.example.TD2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void verifierResultatDivision() {
        assertThat(MathUtils.divide(4, 2)).isEqualTo(2);
    }

    @Test
    void renvoyerMessageErreurPourDivisionParSero() {
        assertThatThrownBy(() -> MathUtils.divide(4, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Division par zéro !");
    }
}
