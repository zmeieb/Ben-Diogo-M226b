package zoo.Angestellte;

/**
 * AtomarerZoowaerter.java
 * <p>
 * Änderungen:
 * -
 * <p>
 * Atomarer Zoowärter
 *
 * @author Ben Meier
 * @since 30.01.2019
 */

public class AtomarerZoowaerter extends Zoowaerter {


    public AtomarerZoowaerter(String name, int alter) {
        super(name, alter);
    }


    /**
     * Wenn ein Käfigleiter die Anzahl seiner Zoowärter möchte, kann er jeden einzelnen abfragen gehen
     *
     * @return 1 steht für 1 Zoowärter
     */
    @Override
    public int getZoowärterAnzahl() {
        return 1;
    }

}
