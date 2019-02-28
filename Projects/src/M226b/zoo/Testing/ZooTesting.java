package M226b.zoo.Testing;

import M226b.zoo.Angestellte.AtomarerZoowaerter;
import M226b.zoo.Angestellte.Kaefigleiter;
import M226b.zoo.FressVerhalten.LangsamFressen;
import M226b.zoo.FressVerhalten.SchnellFressen;
import M226b.zoo.Käfig.AffenKaefig;
import M226b.zoo.Käfig.LoewenKaefig;
import M226b.zoo.Tier.Affe;
import M226b.zoo.Tier.Loewe;
import M226b.zoo.Tier.Tier;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void countListTier() {
        AffenKaefig kaefig = mockKäfig();
        Assert.assertEquals(2, kaefig.getTierList().size());
    }

    @Test
    public void checkKaefigInitialization() {
        LoewenKaefig kaefig = new LoewenKaefig("Afrikanische Löwen");
        kaefig.setTierList(mockTierList());
        Assert.assertEquals("Afrikanische Löwen", kaefig.getName());
        Assert.assertEquals("Affe ", kaefig.getTierList().get(0).toString());
    }

    @Test
    public void checkZoowaerterInitialization() {
        AtomarerZoowaerter atomarerZoowaerter = new AtomarerZoowaerter("Tino", 17);
        Assert.assertEquals("Tino", atomarerZoowaerter.getName());
        Assert.assertEquals(17, atomarerZoowaerter.getAlter());
    }

    @Test(expected = AssertionError.class)
    public void negativCheckLöwenInitialization() {
        Loewe loewe = new Loewe();
        loewe.setFressVerhalten(new LangsamFressen());
        Assert.assertTrue("Bär ".equals(loewe.toString()));
    }

    private Kaefigleiter mockKäfigleiterWith3Mitarbeiter() {
        Kaefigleiter kaefigleiter = new Kaefigleiter("Albert", 53, new AffenKaefig("affen1"));
        AtomarerZoowaerter atomarerZoowaerter1 = new AtomarerZoowaerter("Luca", 25);
        AtomarerZoowaerter atomarerZoowaerter2 = new AtomarerZoowaerter("Tim", 12);
        AtomarerZoowaerter atomarerZoowaerter3 = new AtomarerZoowaerter("Dirhat", 28);
        kaefigleiter.getListZoowaerter().add(atomarerZoowaerter1);
        kaefigleiter.getListZoowaerter().add(atomarerZoowaerter3);
        kaefigleiter.getListZoowaerter().add(atomarerZoowaerter2);
        return kaefigleiter;
    }

    private AffenKaefig mockKäfig() {
        AffenKaefig affenKaefig = new AffenKaefig("Gorilla Käfig");
        List<Tier> tierList = mockTierList();
        affenKaefig.setTierList(tierList);

        return affenKaefig;
    }

    private List<Tier> mockTierList() {
        List<Tier> tierList = new ArrayList<>();
        Affe affe1 = new Affe();
        LangsamFressen fressVerhaltenAffe1 = new LangsamFressen();
        affe1.setFressVerhalten(fressVerhaltenAffe1);
        Affe affe2 = new Affe();
        SchnellFressen fressVerhaltenAffe2 = new SchnellFressen();
        affe2.setFressVerhalten(fressVerhaltenAffe2);
        tierList.add(affe1);
        tierList.add(affe2);
        return tierList;
    }
}
