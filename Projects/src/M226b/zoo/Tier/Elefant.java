package M226b.zoo.Tier;

import M226b.zoo.FressVerhalten.FressVerhalten;
import M226b.zoo.FressVerhalten.LangsamFressen;
import M226b.zoo.TrinkVerhalten.LangsamTrinken;
import M226b.zoo.TrinkVerhalten.TrinkVerhalten;

/**
 * Elefant.java
 * <p>
 * Änderungen:
 * Diogo Caraça - 30.01.2019 - toString() überschrieben
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

    /**
     * Gibt den Elefanten aus
     *
     * @return Elefant
     */
    @Override
    public String toString() {
        return "Elefant ";
    }
}
