package zoo.Angestellte;

/**
 * Zoowaerter.java
 * <p>
 * Änderungen:
 * Diogo Caraça - 30.01.2019 - Code formatiert & print() hinzugefügt
 * <p>
 * Atomarer Zoowärter
 *
 * @author Ben Meier
 * @since 30.01.2019
 */
public abstract class Zoowaerter {

    /**
     * Name des Zoowärters
     */
    private String name;

    /**
     * Alter des Zoowärters
     */
    private int alter;

    /**
     * Setzt den Namen und das Alter des Zoowärters fest beim initialisieren
     *
     * @param name  Name des Zoowärters
     * @param alter Alter des Zoowärters
     */
    Zoowaerter(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    /**
     * Holt die Anzahl der Zoowärter
     *
     * @return Anzahl der Zoowärter
     */
    public abstract int getZoowärterAnzahl();

    /**
     * Holt den Namen des Zoowärters
     *
     * @return Name des Zoowärters
     */
    public String getName() {
        return name;
    }

    /**
     * Holt das Alter des Zoowärters
     *
     * @return Alter des Zoowärters
     */
    public int getAlter() {
        return alter;
    }

    /**
     * Gibt den Zoowärter aus
     */
    public abstract void print();

}
