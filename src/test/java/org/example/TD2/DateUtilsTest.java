package org.example.TD2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class DateUtilsTest {

    @Test
    void retournerDateActuelle() {
        assertThat(DateUtils.getToday()).isEqualTo(LocalDate.now());
    }

    @Test
    void verifierIntervalleDeDate() {
        assertThat(DateUtils.getToday())
                .isAfter(LocalDate.of(2000, 1, 1))
                .isBefore(LocalDate.of(2100, 1, 1));
    }
}
