package M226b.zoo.Tier;

import M226b.zoo.FressVerhalten.FressVerhalten;
import M226b.zoo.TrinkVerhalten.TrinkVerhalten;

/**
 * Tier.java
 * <p>
 * Änderungen:
 * -
 * <p>
 * Abstrakte Klasse Tier vererbt die gleichen
 * Verhalten an den unterschiedlichen Tieren
 *
 * @author Diogo Caraça
 * @since 29.01.2019
 */
public abstract class Tier {
    /**
     * Fressverhalten des Tieres
     */
    private FressVerhalten fressVerhalten;
    /**
     * Trinkverhalten des Tieres
     */
    private TrinkVerhalten trinkVerhalten;


    /**
     * Setzt das Fressverhalten des Tieres fest
     *
     * @param fressVerhalten das erwünschte Fressverhalten
     */
    public void setFressVerhalten(FressVerhalten fressVerhalten) {
        this.fressVerhalten = fressVerhalten;
    }

    /**
     * Setzt das Fressverhalten des Tieres fest
     *
     * @param trinkVerhalten das erwünschte Trinkverhalten
     */
    public void setTrinkVerhalten(TrinkVerhalten trinkVerhalten) {
        this.trinkVerhalten = trinkVerhalten;
    }

    /**
     * Das Tier fängt an zu fressen.
     */
    public void fressen() {
        fressVerhalten.fressen();
    }

    /**
     * Das Tier fängt an zu trinken.
     */
    public void trinken() {
        trinkVerhalten.trinken();
    }
}
