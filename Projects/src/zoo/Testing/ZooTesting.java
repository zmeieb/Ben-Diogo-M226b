package zoo.Testing;

import org.junit.Assert;
import org.junit.Test;
import zoo.Angestellte.AtomarerZoowaerter;
import zoo.Angestellte.Kaefigleiter;

public class ZooTesting {


    @Test
    public void addZoowaerterToList() {
        Kaefigleiter kaefigleiter = mockKäfigleiterWith3Mitarbeiter();
        AtomarerZoowaerter atomarerZoowaerter1 = new AtomarerZoowaerter("Ali", 51);
        AtomarerZoowaerter atomarerZoowaerter2 = new AtomarerZoowaerter("Artur", 43);
        kaefigleiter.addZoowaerter(atomarerZoowaerter1);
        kaefigleiter.addZoowaerter(atomarerZoowaerter2);

        Assert.assertEquals(6, kaefigleiter.getZoowärterAnzahl());
    }


    @Test
    public void removeZoowaerterFromList() {
        Kaefigleiter kaefigleiter = mockKäfigleiterWith3Mitarbeiter();
        kaefigleiter.removeZoowaerter(kaefigleiter.getZoowaerter(0));

        Assert.assertEquals(3, kaefigleiter.getZoowärterAnzahl());
    }


    @Test
    public void countAnzahlZooWärterCorrect() {
        Kaefigleiter kaefigleiter = mockKäfigleiterWith3Mitarbeiter();

        Assert.assertEquals(4, kaefigleiter.getZoowärterAnzahl());
    }


    private Kaefigleiter mockKäfigleiterWith3Mitarbeiter() {
        Kaefigleiter kaefigleiter = new Kaefigleiter("Albert", 53);
        AtomarerZoowaerter atomarerZoowaerter1 = new AtomarerZoowaerter("Luca", 25);
        AtomarerZoowaerter atomarerZoowaerter2 = new AtomarerZoowaerter("Tim", 12);
        AtomarerZoowaerter atomarerZoowaerter3 = new AtomarerZoowaerter("Dirhat", 28);
        kaefigleiter.getListZoowaerter().add(atomarerZoowaerter1);
        kaefigleiter.getListZoowaerter().add(atomarerZoowaerter3);
        kaefigleiter.getListZoowaerter().add(atomarerZoowaerter2);
        return kaefigleiter;
    }
}
