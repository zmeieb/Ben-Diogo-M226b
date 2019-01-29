package zoo.FressVerhalten;

/**
 * SchnellFressen.java
 * <p>
 * Änderungen:
 * -
 * <p>
 * Klasse für das schnelle Fressverhalten der Tiere
 *
 * @author Diogo Caraça
 * @since 29.01.2019
 */
public class SchnellFressen implements FressVerhalten {
    /**
     * Das Tier fängt an schnell zu fressen.
     */
    @Override
    public void fressen() {
        System.out.println("SCHNELL FRESSEN!!");
    }
}
