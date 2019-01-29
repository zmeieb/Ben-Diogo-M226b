package zoo;

import zoo.FressVerhalten.FressVerhalten;
import zoo.FressVerhalten.SchnellFressen;
import zoo.TrinkVerhalten.SchnellTrinken;
import zoo.TrinkVerhalten.TrinkVerhalten;

/**
 * Loewe.java
 * <p>
 * Änderungen:
 * -
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
}
