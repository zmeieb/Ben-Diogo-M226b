package zoo;

import zoo.Angestellte.Zoowaerter;
import zoo.Käfig.Kaefig;

import java.util.ArrayList;

/**
 * Zoo.java
 * <p>
 * Änderungen:
 * Diogo Caraça - 30.01.2019 - Zoo unabhängig von den Käfigen gemacht (zuerst Zoo ohne Käfige erstellbar), nötige Getters erstellt
 * <p>
 * Zoo mit Käfigen, Tieren und Zoowärtern
 *
 * @author Diogo Caraça
 * @since 29.01.2019
 */
public class Zoo {

    /**
     * Name des Zoos
     */
    private String name;

    /**
     * Liste der Käfige
     */
    private ArrayList<Kaefig> käfige;

    /**
     * Liste der Zoowärter
     */
    private ArrayList<Zoowaerter> zoowärter;


    /**
     * Setzt den Namen des Zoos fest beim initialisieren
     *
     * @param name Name des Zoos
     */
    public Zoo(String name) {
        this.name = name;
    }

    /**
     * Holt den Namen des Zoos
     *
     * @return Name des Zoos
     */
    public String getName() {
        return name;
    }

    /**
     * Holt die Liste der Käfige im Zoo
     *
     * @return Liste der Käfige im Zoo
     */
    public ArrayList<Kaefig> getKäfige() {
        return käfige;
    }

    /**
     * Setzt die Liste der Zoowärter im Zoo fest
     *
     * @param zoowärter Liste der Zoowärter
     */
    public void setZoowärter(ArrayList<Zoowaerter> zoowärter) {
        this.zoowärter = zoowärter;
    }

    /**
     * Setzt die Liste der Käfige im Zoo fest
     *
     * @param käfige Liste der Käfige
     */
    public void setKäfige(ArrayList<Kaefig> käfige) {
        this.käfige = käfige;
    }
}
