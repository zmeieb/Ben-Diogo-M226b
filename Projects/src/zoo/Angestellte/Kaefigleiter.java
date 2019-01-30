package zoo.Angestellte;

import zoo.Käfig.Kaefig;

import java.util.ArrayList;
import java.util.List;

public class Kaefigleiter extends Zoowaerter {

    public Kaefigleiter(String name, int alter) {
        super(name, alter);
    }

    public Kaefigleiter(String name, int alter, Kaefig kaefig) {
        super(name, alter);
        this.kaefig = kaefig;
    }

    @Override
    public int getZoowärterAnzahl() {
        int anzahl = 1;
        for (Zoowaerter zoowaerter : listZoowaerter) {
            anzahl += zoowaerter.getZoowärterAnzahl();
        }
        return anzahl;
    }

    public void addZoowaerter(Zoowaerter zoowaerter) {
        getListZoowaerter().add(zoowaerter);
    }

    public void removeZoowaerter(Zoowaerter zoowaerter) {
        getListZoowaerter().remove(zoowaerter);
    }

    public Zoowaerter getZoowaerter(int index) {
        return getListZoowaerter().get(index);
    }

    private Kaefig kaefig;
    private List<Zoowaerter> listZoowaerter = new ArrayList<>();

    public List<Zoowaerter> getListZoowaerter() {
        return listZoowaerter;
    }

    public void setListZoowaerter(List<Zoowaerter> listZoowaerter) {
        this.listZoowaerter = listZoowaerter;
    }

    public Kaefig getKäfig() {
        return kaefig;
    }

    public void setKäfig(Kaefig käfig) {
        this.kaefig = käfig;
    }
}
