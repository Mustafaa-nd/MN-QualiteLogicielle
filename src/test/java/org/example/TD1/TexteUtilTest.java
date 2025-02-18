package org.example.TD1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TexteUtilTest {

    @Test
    void testTransformationTexte() {
        assertEquals("MUGIWARA NO MUSTAFAA", TexteUtil.transformerTexte("  mugiwara no mustafaa  "));
        assertEquals("BONJOUR MONSIEUR", TexteUtil.transformerTexte("   Bonjour Monsieur"));
        assertEquals("TEST", TexteUtil.transformerTexte("test     "));
        assertEquals("MERCI", TexteUtil.transformerTexte("MERCI     "));
        assertEquals("S'IL VOUS PLAIT, DISAIT-IL", TexteUtil.transformerTexte("S'il vous plait, disait-il     "));
        assertEquals("", TexteUtil.transformerTexte("     "));
        assertNull(TexteUtil.transformerTexte(null));
    }
}
