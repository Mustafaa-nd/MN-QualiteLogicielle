package org.example.TD2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void retourneMajusculesQuandTexteEnMinuscule() {
        assertThat(StringUtils.toUpperCase("java"))
                .isEqualTo("JAVA");
    }

    @Test
    void retourneNullQuandValeurNull() {
        assertThat(StringUtils.toUpperCase(null))
                .isNull();
    }

    @Test
    void retourneTexteMajusculeCommencantParJEtLongueurQuatre() {
        assertThat(StringUtils.toUpperCase("java"))
                .startsWith("J")
                .hasSize(4);
    }
}
