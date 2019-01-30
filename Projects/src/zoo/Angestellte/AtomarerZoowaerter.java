package zoo.Angestellte;

public class AtomarerZoowaerter extends Zoowaerter {


    public AtomarerZoowaerter(String name, int alter) {
        super(name, alter);
    }

    @Override
    public int getZoowärterAnzahl() {
        return 1;
    }

}
