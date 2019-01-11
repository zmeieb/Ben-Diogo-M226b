package fussballManager;

import org.junit.Assert;
import org.junit.Test;

public class FootballManagerTesting {

    @Test
    public void testGoalKeeperInitialization() {
        //Arrange
        Player goalkeeper = new Goalkeeper("Torben", 25, 1, 77, 56, 66, 45, 88);
        goalkeeper.setName("Torben");
        goalkeeper.setNumber(1);
        goalkeeper.setDefending(77);
        goalkeeper.setShooting(66);
        goalkeeper.setPace(45);
        goalkeeper.setPassing(56);
        goalkeeper.setDribbling(88);

        //Act
        Assert.assertEquals("Torben", goalkeeper.getName());
        Assert.assertEquals(1, goalkeeper.getNumber());
        Assert.assertEquals(77, goalkeeper.getDefending());
        Assert.assertEquals(66, goalkeeper.getShooting());
        Assert.assertEquals(45, goalkeeper.getPace());
        Assert.assertEquals(56, goalkeeper.getPassing());
        Assert.assertEquals(88, goalkeeper.getDribbling());
    }

    @Test
    public void testStrikerInitialization() {
        //Arrange
        Striker striker = new Striker("Juaanson", 27, 11, 78, 76, 67, 91, 87);
        //Act
        Assert.assertEquals("Juaanson", striker.getName());
        Assert.assertEquals(27, striker.getAge());
        Assert.assertEquals(11, striker.getNumber());
        Assert.assertEquals(78, striker.getDefending());
        Assert.assertEquals(67, striker.getShooting());
        Assert.assertEquals(91, striker.getPace());
        Assert.assertEquals(76, striker.getPassing());
        Assert.assertEquals(87, striker.getDribbling());
    }
}
