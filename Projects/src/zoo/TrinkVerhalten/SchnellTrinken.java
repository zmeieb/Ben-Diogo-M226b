package zoo.TrinkVerhalten;

/**
 * SchnellTrinken.java
 * <p>
 * Änderungen:
 * -
 * <p>
 * Klasse für das schnelle Trinkverhalten der Tier
 *
 * @author Diogo Caraça
 * @since 29.01.2019
 */
public class SchnellTrinken implements TrinkVerhalten {
    /**
     * Das Tier fängt an schnell zu trinken.
     */
    @Override
    public void trinken() {
        System.out.println("SCHNELL TRINKEN!!");
    }
}
