package M226b.zoo.Tier;

import M226b.zoo.FressVerhalten.FressVerhalten;
import M226b.zoo.FressVerhalten.LangsamFressen;
import M226b.zoo.TrinkVerhalten.SchnellTrinken;
import M226b.zoo.TrinkVerhalten.TrinkVerhalten;

/**
 * Affe.java
 * <p>
 * Änderungen:
 * Diogo Caraça - 30.01.2019 - toString() überschrieben
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

    /**
     * Gibt den Affen aus
     *
     * @return Affe
     */
    @Override
    public String toString() {
        return "Affe ";
    }
}
