package M226b.firma;

/**
 * Name: AtomarerMitarbeiter.java
 * Autoren: Ben Meier
 * Änderungen: 20.01.2019 / Ben Meier / Methode implementiert
 * <p>
 * Repräsentiert einen normalen Mitarbeiter
 *
 * @author Ben Meier
 */
public class AtomarerMitarbeiter extends Mitarbeiter {

    /**
     * Holt sich die Anzahl der Mitarbeiter
     *
     * @return Gibt die Anzahl der Mitarbeiter (1 Mitarbeiter) zurück
     */
    @Override
    public int getMitarbeiterAnzahl() {
        return 1;
    }
}
