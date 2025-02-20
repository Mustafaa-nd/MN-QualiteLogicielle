package org.example.TD3;

import static com.google.common.truth.Truth.*;

import org.example.TD2.Person;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void comparerDeuxPersonnesIdentiques() {
        Person person = new Person("Alice", 30);
        assertThat(person.getName()).isEqualTo("Alice");
    }

    @Test
    void verifieNomEtAge() {
        Person person = new Person("Alice", 30);
        assertThat(person.getAge()).isGreaterThan(20);
    }
}
