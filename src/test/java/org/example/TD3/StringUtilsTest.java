package org.example.TD3;

import static com.google.common.truth.Truth.*;

import org.example.TD2.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void verifierConversionEnMajuscule() {
        String result = StringUtils.toUpperCase("java");
        assertThat(result).isEqualTo("JAVA");
    }

    @Test
    void verifierLaPresenceDuneChaineDeCaractere() {
        assertThat("Test").contains("es");
    }

    @Test
    void verifierDebutEtFin() {
        assertThat("Hello").startsWith("He");
        assertThat("Hello").endsWith("o");
    }
}
