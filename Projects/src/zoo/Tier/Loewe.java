package zoo.Tier;

import zoo.FressVerhalten.FressVerhalten;
import zoo.FressVerhalten.SchnellFressen;
import zoo.TrinkVerhalten.SchnellTrinken;
import zoo.TrinkVerhalten.TrinkVerhalten;

/**
 * Loewe.java
 * <p>
 * Änderungen:
 * Diogo Caraça - 30.01.2019 - toString() überschrieben
 * <p>
 * Ein Löwe, der essen und trinken kann.
 *
 * @author Diogo Caraça
 * @since 29.01.2019
 */
public class Loewe extends Tier {
    /**
     * Der Löwe isst schnell.
     */
    private FressVerhalten fressVerhalten = new SchnellFressen();
    /**
     * Der Löwe trinkt schnell.
     */
    private TrinkVerhalten trinkVerhalten = new SchnellTrinken();

    /**
     * Gibt den Löwen aus
     *
     * @return Löwe
     */
    @Override
    public String toString() {
        return "Löwe ";
    }
}
