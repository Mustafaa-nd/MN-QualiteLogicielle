package org.example.TD1;

import java.util.regex.Pattern;

public class Utilisateur {
    // Nouvelle regex stricte qui interdit ".." mais autorise les sous-domaines
    private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9]+(?:\\.[A-Za-z0-9]+)+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean estEmailValide(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        if (email.contains("..")) { // Vérifie si ".." est présent
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
}
