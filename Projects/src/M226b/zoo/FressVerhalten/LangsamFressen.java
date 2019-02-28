package M226b.zoo.FressVerhalten;

/**
 * LangsamFressen.java
 * <p>
 * Änderungen:
 * -
 * <p>
 * Klasse für das langsame Fressverhalten der Tiere
 *
 * @author Diogo Caraça
 * @since 29.01.2019
 */
public class LangsamFressen implements FressVerhalten {
    /**
     * Das Tier fängt an langsam zu fressen.
     */
    @Override
    public void fressen() {
        System.out.println("Laaaangsaaaaam fresseeeen...");
    }
}
