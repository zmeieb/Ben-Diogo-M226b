package zoo.Tier;

import zoo.FressVerhalten.FressVerhalten;
import zoo.FressVerhalten.LangsamFressen;
import zoo.TrinkVerhalten.LangsamTrinken;
import zoo.TrinkVerhalten.TrinkVerhalten;

/**
 * Elefant.java
 * <p>
 * Änderungen:
 * -
 * <p>
 * Ein Elefant, der essen und trinken kann.
 *
 * @author Diogo Caraça
 * @since 29.01.2019
 */
public class Elefant extends Tier {
    /**
     * Der Elefant isst langsam.
     */
    private FressVerhalten fressVerhalten = new LangsamFressen();
    /**
     * Der Elefant trinkt langsam.
     */
    private TrinkVerhalten trinkVerhalten = new LangsamTrinken();
}
