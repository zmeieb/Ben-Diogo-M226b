package zoo.Angestellte;

import zoo.Käfig.Kaefig;

import java.util.ArrayList;
import java.util.List;


/**
 * AtomarerZoowaerter.java
 * <p>
 * Änderungen:
 * -
 * <p>
 * Atomarer Zoowärter
 *
 * @author Ben Meier
 * @since 30.01.2019
 */

public class Kaefigleiter extends Zoowaerter {

    public Kaefigleiter(String name, int alter) {
        super(name, alter);
    }

    public Kaefigleiter(String name, int alter, Kaefig kaefig) {
        super(name, alter);
        this.kaefig = kaefig;
    }

    /**
     * Als Käfigleiter kann man die Anzahl seiner Zoowärter abfragen
     * Man iteriert durch seine Zoowärter liste und geht jeden Zoowärter abfragen
     * Jeder Zoowärter gibt +1 zurück
     *
     * @return die Anzahl Zoowärter, die ein Käfigleiter besitzt
     */
    @Override
    public int getZoowärterAnzahl() {
        int anzahl = 1;
        for (Zoowaerter zoowaerter : listZoowaerter) {
            anzahl += zoowaerter.getZoowärterAnzahl();
        }
        return anzahl;
    }


    /**
     * Als Käfigleiter kann man einen Zoowärter zu seinen unterstellten, bzw. seiner Liste hinzufügen
     *
     * @param zoowaerter Ein Objekt des Typs Zoowärter, der zu der Liste hinzugefügt werden soll
     */
    public void addZoowaerter(Zoowaerter zoowaerter) {
        getListZoowaerter().add(zoowaerter);
    }


    /**
     * Als Käfigleiter kann man einen Zoowärter von seiner Liste entfernen
     *
     * @param zoowaerter Ein Objekt des Typs Zoowärter, der von der Liste entfernt werden soll
     */
    public void removeZoowaerter(Zoowaerter zoowaerter) {
        getListZoowaerter().remove(zoowaerter);
    }


    /**
     * Als Käfigleiter kann man einen bestimmten Zoowärter auswählen, der sich in der Zoowärterliste befindet
     *
     * @param index Der Index wird gebraucht, um einen bestimmten Zoowärter in der Liste zu finden
     * @return ein Zoowärter aus der Zoowärterliste mit dem index des mitgegeben Integer
     */
    public Zoowaerter getZoowaerter(int index) {
        return getListZoowaerter().get(index);
    }

    /**
     * Ein Käfigleiter hat eine Liste mit allen unterstellen Zoowärter
     */
    private List<Zoowaerter> listZoowaerter = new ArrayList<>();


    /**
     * Ein Käfigleiter ist leiter über ein Käfig
     */
    private Kaefig kaefig;

    /**
     * @return listZoowaerter ist ein Liste mit Zoowärtern
     */
    public List<Zoowaerter> getListZoowaerter() {
        return listZoowaerter;
    }

    /**
     * Man kann bei einem Käfigleiter eine Liste von seinen Zoowärtern setzen
     *
     * @param listZoowaerter eine Liste mit Zoowärtern
     */
    public void setListZoowaerter(List<Zoowaerter> listZoowaerter) {
        this.listZoowaerter = listZoowaerter;
    }

    /**
     * Ein Käfigleiter kann sein eigenes Käfig bekommen
     *
     * @return ein Objekt vom Typ Kaefig
     */
    public Kaefig getKäfig() {
        return kaefig;
    }

    /**
     * Man kann das Käfig eines Käfigsleiter manuell setzen
     *
     * @param käfig ein Objekt vom Typ Käfig
     */
    public void setKäfig(Kaefig käfig) {
        this.kaefig = käfig;
    }
}
