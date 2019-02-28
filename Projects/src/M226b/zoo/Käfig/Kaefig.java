package M226b.zoo.Käfig;

import M226b.zoo.Tier.Tier;

import java.util.List;

/**
 * Kaefig.java
 * <p>
 * Änderungen:
 * -
 * <p>
 * Abstrakte Klasse Käfig vererbt die gleichen
 * Eigenschaften der unterschiedlichen Käfigen
 *
 * @author Diogo Caraça
 * @since 29.01.2019
 */
public abstract class Kaefig {

    /**
     * Name des Käfiges
     */
    private String name;
    /**
     * Liste der Tier im Käfig
     */
    private List<? extends Tier> tierList;

    /**
     * Setzt den Namen des Käfiges fest beim initialisieren
     *
     * @param name Name des Käfiges
     */
    public Kaefig(String name) {
        this.name = name;
    }

    /**
     * Holt den Namen des Käfiges
     *
     * @return Name des Käfiges
     */
    public String getName() {
        return name;
    }

    /**
     * Holt die Liste der Tier im Käfig
     *
     * @return Liste der Tier im Käfig
     */
    public List<? extends Tier> getTierList() {
        return tierList;
    }

    /**
     * Setzt die Liste der erwünschten Tier im Käfig fest
     *
     * @param tierList Liste der Tier
     */
    public void setTierList(List<? extends Tier> tierList) {
        this.tierList = tierList;
    }
}
