package zoo.Tier;

import zoo.FressVerhalten.FressVerhalten;
import zoo.FressVerhalten.LangsamFressen;
import zoo.TrinkVerhalten.SchnellTrinken;
import zoo.TrinkVerhalten.TrinkVerhalten;

/**
 * Affe.java
 * <p>
 * Änderungen:
 * -
 * <p>
 * Ein Affe, der essen und trinken kann.
 *
 * @author Diogo Caraça
 * @since 29.01.2019
 */
public class Affe extends Tier {
    /**
     * Der Affe isst langsam.
     */
    private FressVerhalten fressVerhalten = new LangsamFressen();
    /**
     * Der Affe trinkt schnell.
     */
    private TrinkVerhalten trinkVerhalten = new SchnellTrinken();
}
