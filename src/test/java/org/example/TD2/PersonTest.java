package org.example.TD2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void verifieNomEtAge() {
        // Vérifie que new Person("Alice", 30) a name = "Alice" et age = 30
        Person person = new Person("Alice", 30);

        assertThat(person.getName()).isEqualTo("Alice");
        assertThat(person.getAge()).isEqualTo(30);
    }

    @Test
    void comparerDeuxPersonnesIdentiques() {
        // Vérifie que deux objets Person identiques sont égaux avec usingRecursiveComparison()
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        assertThat(person1).usingRecursiveComparison().isEqualTo(person2);
    }
}
