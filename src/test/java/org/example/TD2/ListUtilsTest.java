package org.example.TD2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;

class ListUtilsTest {

    @Test
    void contientAliceEtAnna() {
        List<String> filteredNames = ListUtils.filterNames(List.of("Alice", "Bob", "Anna"));
        assertThat(filteredNames).contains("Alice", "Anna");
    }

    @Test
    void contientPasBob() {
        List<String> filteredNames = ListUtils.filterNames(List.of("Alice", "Bob", "Anna"));
        assertThat(filteredNames).doesNotContain("Bob");
    }

    @Test
    void retourneListeAvecDeuxElements() {
        List<String> filteredNames = ListUtils.filterNames(List.of("Alice", "Bob", "Anna"));
        assertThat(filteredNames).hasSize(2);
    }
}
