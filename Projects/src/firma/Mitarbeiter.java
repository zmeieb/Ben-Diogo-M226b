package firma;

/**
 * Name: Mitarbeiter.java
 * Änderungen: 20.01.2019 / Ben Meier / Klasse mit Methoden und Attributen implementiert
 * 20.01.2019 / Diogo Caraça / print-Methode implementiert
 * 22.01.2019 / Ben Meier / Korrekturen vorgenommen
 * <p>
 * Mitarbeiter bildet die Methoden und Attribute der Unterklassen.
 * Es ist abstrakt, weil es keine Mitarbeiter geben darf (sondern
 * nur Atomare Mitarbeiter und Abteilungsleiter).
 *
 * @author Ben Meier & Diogo Caraça
 */
public abstract class Mitarbeiter {

    /**
     * Den Namen des Mitarbeiters
     */
    private String name;

    /**
     * Die Telefonnummer des Mitarbeiters
     */
    private int telefonNr;

    /**
     * Holt sich den Namen des Mitarbeiters
     *
     * @return Gibt den Namen des Mitarbeiters zurück
     */
    protected String getName() {
        return name;
    }

    /**
     * Setzt den Namen des Mitarbeiters
     *
     * @param name der Name den man einsetzen möchte
     */
    protected void setName(String name) {
        this.name = name;
    }

    /**
     * Holt sich die Telefonnummer des Mitarbeiters
     *
     * @return Gibt die Telefonnummer des Mitarbeiters zurück
     */
    protected int getTelefonNr() {
        return telefonNr;
    }

    /**
     * Setzt die Telefonnummer des Mitarbeiters
     *
     * @param telefonNr die Telefonnummer den man einsetzen möchte
     */
    protected void setTelefonNr(int telefonNr) {
        this.telefonNr = telefonNr;
    }

    /**
     * Holt sich die Anzahl der Mitarbeiter
     *
     * @return Gibt die Anzahl der Mitarbeiter zurück
     */
    public abstract int getMitarbeiterAnzahl();

    public void print() {

    }
}
