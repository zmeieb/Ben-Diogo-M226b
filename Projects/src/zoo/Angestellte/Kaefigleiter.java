package zoo.Angestellte;

import zoo.Käfig.Kaefig;

import java.util.ArrayList;
import java.util.List;


/**
 * AtomarerZoowaerter.java
 * <p>
 * Änderungen:
 * Diogo Caraça - 30.01.2019 - Code formatiert und print() hinzugefügt
 * Ben Meier - 30.01.2019 - System outs verschönert
 * <p>
 * Atomarer Zoowärter
 *
 * @author Ben Meier
 * @since 30.01.2019
 */
public class Kaefigleiter extends Zoowaerter {

    /**
     * Ein Käfigleiter hat eine Liste mit allen unterstellen Zoowärter
     */
    private List<Zoowaerter> listZoowaerter = new ArrayList<>();

    /**
     * der Käfig, welches der Käfigleiter leitet
     */
    private Kaefig kaefig;

    /**
     * Setzt den Namen, das Alter und den Käfig des Leiters fest beim initialisieren
     *
     * @param name   Name des Zoowärters
     * @param alter  Alter des Zoowärters
     * @param kaefig Käfig, welches der Leiter leitet
     */
    public Kaefigleiter(String name, int alter, Kaefig kaefig) {
        super(name, alter);
        this.kaefig = kaefig;
    }

    /**
     * Als Käfigleiter kann man die Anzahl seiner Zoowärter abfragen
     * Man iteriert durch seine Zoowärter liste und geht jeden Zoowärter abfragen
     * Jeder Zoowärter gibt +1 zurück
     * Der Leiter selber wird auch dazugezählt
     *
     * @return die Anzahl Zoowärter, die ein Käfigleiter besitzt und sich selber
     */
    @Override
    public int getZoowärterAnzahl() {
        int anzahl = 1;
        for (Zoowaerter zoowaerter : this.getListZoowaerter()) {
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
        this.getListZoowaerter().add(zoowaerter);
    }


    /**
     * Als Käfigleiter kann man einen Zoowärter von seiner Liste entfernen
     *
     * @param zoowaerter Ein Objekt des Typs Zoowärter, der von der Liste entfernt werden soll
     */
    public void removeZoowaerter(Zoowaerter zoowaerter) {
        this.getListZoowaerter().remove(zoowaerter);
    }


    /**
     * Als Käfigleiter kann man einen bestimmten Zoowärter auswählen, der sich in der Zoowärterliste befindet
     *
     * @param index Der Index wird gebraucht, um einen bestimmten Zoowärter in der Liste zu finden
     * @return ein Zoowärter aus der Zoowärterliste mit dem Index des mitgegeben Integer
     */
    public Zoowaerter getZoowaerter(int index) {
        return this.getListZoowaerter().get(index);
    }


    /**
     * Holt die Liste der unterstellten Zoowärter
     *
     * @return listZoowaerter ist ein Liste mit unterstellten Zoowärtern
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
     * Gibt den Käfigleiter aus und seine untergestellten Zoowärter aus
     */
    public void print() {
        System.out.println("Name: " + this.getName() + "\nAlter: " + this.getAlter());
        for (Zoowaerter zoowaerter : this.getListZoowaerter()) {
            System.out.print("\t\t");
            zoowaerter.print();
        }
    }
}
