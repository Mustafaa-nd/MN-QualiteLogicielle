package org.example.TD3;

import static com.google.common.truth.Truth.*;

import org.example.TD2.ListUtils;
import org.junit.jupiter.api.Test;
import java.util.List;

class ListUtilsTest {

    @Test
    void contientAliceEtAnna() {
        List<String> filteredNames = ListUtils.filterNames(List.of("Alice", "Bob", "Anna"));
        assertThat(filteredNames).containsExactly("Alice", "Anna");
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
