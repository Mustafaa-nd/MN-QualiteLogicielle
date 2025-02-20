package org.example.TD2;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void verifieNomEtAge() {
        Person person = new Person("Alice", 30);

        assertThat(person.getName()).isEqualTo("Alice");
        assertThat(person.getAge()).isEqualTo(30);
    }

    @Test
    void comparerDeuxPersonnesIdentiques() {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        assertThat(person1).usingRecursiveComparison().isEqualTo(person2);
    }
}
