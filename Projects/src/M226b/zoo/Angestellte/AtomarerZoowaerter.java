package M226b.zoo.Angestellte;

/**
 * AtomarerZoowaerter.java
 * <p>
 * Änderungen:
 * Diogo Caraça - 30.01.2019 - Code formatiert und print() hinzugefügt
 * <p>
 * Atomarer Zoowärter
 *
 * @author Ben Meier
 * @since 30.01.2019
 */
public class AtomarerZoowaerter extends Zoowaerter {

    /**
     * Setzt den Namen und das Alter des Zoowärters fest beim initialisieren
     *
     * @param name  Name des Zoowärters
     * @param alter Alter des Zoowärters
     */
    public AtomarerZoowaerter(String name, int alter) {
        super(name, alter);
    }

    /**
     * Der Zoowärter gibt sich selber als 1 zurück
     *
     * @return 1 steht für 1 Zoowärter
     */
    @Override
    public int getZoowärterAnzahl() {
        return 1;
    }

    /**
     * Gibt den Zoowärter aus
     */
    public void print() {
        System.out.println("Name: " + this.getName() + "Alter: " + this.getAlter());
    }

}
