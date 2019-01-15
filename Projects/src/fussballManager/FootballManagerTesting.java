package fussballManager;

import org.junit.Assert;
import org.junit.Test;

public class FootballManagerTesting {

    @Test
    public void testGoalKeeperInitializationWithS() {
        //Arrange
        Player goalkeeper = new Goalkeeper("Torben", 25, 1, 77, 56, 66, 45, 88);

        //Act
        Assert.assertEquals("Torben", goalkeeper.getName());
        Assert.assertEquals(25, goalkeeper.getAge());
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

    @Test
    public void testMidfielderInitialization() {
        Midfielder midfielder = new Midfielder("Don", 33, 15, 83, 94, 74, 78, 76);
        Assert.assertEquals("Don", midfielder.getName());
        Assert.assertEquals(33, midfielder.getAge());
        Assert.assertEquals(15, midfielder.getNumber());
        Assert.assertEquals(83, midfielder.getDefending());
        Assert.assertEquals(74, midfielder.getShooting());
        Assert.assertEquals(78, midfielder.getPace());
        Assert.assertEquals(94, midfielder.getPassing());
        Assert.assertEquals(76, midfielder.getDribbling());
    }

    @Test
    public void testDefenderInitialization() {
        Defender defender = new Defender("Gilbert", 23, 77, 98, 65, 54, 88, 48);
        Assert.assertEquals("Gilbert", defender.getName());
        Assert.assertEquals(23, defender.getAge());
        Assert.assertEquals(77, defender.getNumber());
        Assert.assertEquals(98, defender.getDefending());
        Assert.assertEquals(65, defender.getShooting());
        Assert.assertEquals(88, defender.getPace());
        Assert.assertEquals(65, defender.getPassing());
        Assert.assertEquals(48, defender.getDribbling());
    }
}
