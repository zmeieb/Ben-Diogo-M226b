package M226b.zoo.TrinkVerhalten;

/**
 * SchnellTrinken.java
 * <p>
 * Änderungen:
 * Ben Meier - 30.01.2019 - Ausgabe von trinken() geändert, Javadocs geändert
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
        System.out.println("SCHNELL SCHLUCKEN!!");
    }
}
