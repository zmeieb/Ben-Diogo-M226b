package zoo;

import zoo.Angestellte.Zoowaerter;
import zoo.Käfig.Kaefig;

import java.util.List;

/**
 * Zoo.java
 * <p>
 * Änderungen:
 * -
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
    private List<Kaefig> käfige;

    /**
     * Liste der Zoowärter
     */
    private List<Zoowaerter> zoowärter;


    /**
     * Setzt den Namen und die Käfige des Zoos fest beim initialisieren
     *
     * @param name   Name des Zoos
     * @param käfige Liste der Käfige
     */
    public Zoo(String name, List<Kaefig> käfige) {
        this.name = name;
        this.käfige = käfige;
    }

    /**
     * Setzt die Liste der Zoowärter im Zoo fest
     *
     * @param zoowärter Liste der Zoowärter
     */
    public void setZoowärter(List<Zoowaerter> zoowärter) {
        this.zoowärter = zoowärter;
    }
}
