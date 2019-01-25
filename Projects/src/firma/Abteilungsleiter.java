/*
Name: Abteilungsleiter.java
Autoren: Ben Meier & Diogo Caraça
Änderungen: 20.01.2019 / Ben Meier / Klasse mit Methoden und Attributen spezifiziert
            20.01.2019 / Diogo Caraça / Methoden implementiert und kurze Korrekturen durchgeführt
            22.01.2019 / Ben Meier / Korrekturen vorgenommen
 */

package firma;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Abteilungsleiter.java
 * Änderungen: 20.01.2019 / Ben Meier / Klasse mit Methoden und Attributen spezifiziert
 * 20.01.2019 / Diogo Caraça / Methoden implementiert und kurze Korrekturen durchgeführt
 * 22.01.2019 / Ben Meier / Korrekturen vorgenommen
 * <p>
 * Repräsentiert einen Abteilungsleiter
 *
 * @author Ben Meier & Diogo Caraça
 */
public class Abteilungsleiter extends Mitarbeiter {

    private String abteilung;
    private List<Mitarbeiter> mitarbeiterList = new ArrayList<>();

    /**
     * Fügt einen Mitarbeiter zur Mitarbeiterliste hinzu
     *
     * @param mitarbeiter der einzufügende Mitarbeiter
     */
    public void add(Mitarbeiter mitarbeiter) {
        mitarbeiterList.add(mitarbeiter);
    }

    /**
     * Löscht einen Mitarbeiter aus der Mitarbeiterliste
     *
     * @param mitarbeiter der Mitarbeiter, der gelöscht wird
     */
    public void remove(Mitarbeiter mitarbeiter) {
        mitarbeiterList.remove(mitarbeiter);
    }

    /**
     * Holt einen Mitarbeiter aus der Mitarbeiterliste
     *
     * @param index der Index auf dem sich der gesuchte Mitarbeiter befindet
     * @return Gibt den gesuchten Mitarbeiter zurück
     */
    public Mitarbeiter getMitarbeiter(int index) {
        return mitarbeiterList.get(index);
    }

    /**
     * Holt sich die Anzahl der untergestellten Mitarbeiter mit sich selber
     *
     * @return Gibt die Anzahl der untergestellten Mitarbeiter (sich selber inklusive) zurück
     */
    @Override
    public int getMitarbeiterAnzahl() {
        int summe = 1; //Für jeweils 1 Abteilungsleiter
        for (Mitarbeiter ma : mitarbeiterList) {
            summe += ma.getMitarbeiterAnzahl();
        }
        return summe;
    }

    /**
     * Holt sich die Abteilung des Abteilungsleiters
     *
     * @return Gibt die Abteilung zurück
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Setzt die Abteilung des Abteilungsleiters
     *
     * @param abteilung die einzusetzende Abteilung
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

}
