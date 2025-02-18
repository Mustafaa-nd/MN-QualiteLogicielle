package org.example.TD1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilisateurTest {

    @Test
    void testEmailsValides() {
        assertTrue(Utilisateur.estEmailValide("exemple@test.com"));
        assertTrue(Utilisateur.estEmailValide("user.name+tag+sorting@example.com"));
        assertTrue(Utilisateur.estEmailValide("admin@mail.co.uk"));
    }

    @Test
    void testEmailsInvalides() {
        assertFalse(Utilisateur.estEmailValide(null)); // Email null
        assertFalse(Utilisateur.estEmailValide("")); // Email vide
        assertFalse(Utilisateur.estEmailValide("plainaddress")); // Pas de @
        assertFalse(Utilisateur.estEmailValide("test@.com")); // Pas de domaine valide
        assertFalse(Utilisateur.estEmailValide("user@domain..com")); // Double point dans le domaine
        assertFalse(Utilisateur.estEmailValide("jean-#paul@gmail.com"));
    }
}
