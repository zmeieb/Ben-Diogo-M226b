package fussballManager;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


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
    public void testThatShouldSucceed() {
    }

    @Test
    public void testDefenderInitialization() {
        Defender defender = new Defender("Gilbert", 23, 77, 98, 65, 54, 88, 48);
        Assert.assertEquals("Gilbert", defender.getName());
        Assert.assertEquals(23, defender.getAge());
        Assert.assertEquals(77, defender.getNumber());
        Assert.assertEquals(98, defender.getDefending());
        Assert.assertEquals(54, defender.getShooting());
        Assert.assertEquals(88, defender.getPace());
        Assert.assertEquals(65, defender.getPassing());
        Assert.assertEquals(48, defender.getDribbling());
    }

    @Test
    public void testTeamInitialization() {


        MainTrainer mainTrainer = new MainTrainer("Holger", 56, 99, 76);
        CoTrainer coTrainer = new CoTrainer("Roberto", 66, 86);
        Goalkeeper goalkeeper = new Goalkeeper("Torben", 25, 1, 77, 56, 66, 45, 88);
        Striker striker = new Striker("Juaanson", 27, 11, 78, 76, 67, 91, 87);
        Midfielder midfielder = new Midfielder("Don", 33, 15, 83, 94, 74, 78, 76);
        Defender defender = new Defender("Gilbert", 23, 77, 98, 65, 54, 88, 48);

        Team team = createMockTeam();

        Assert.assertSame(mainTrainer.getName(), team.getMainTrainer().getName());
        Assert.assertSame(coTrainer.getName(), team.getCoTrainer().getName());
        Assert.assertSame(goalkeeper.getName(), team.getPlayers().get(0).getName());
        Assert.assertSame(striker.getName(), team.getPlayers().get(1).getName());
        Assert.assertSame(midfielder.getName(), team.getPlayers().get(2).getName());
        Assert.assertSame(defender.getName(), team.getPlayers().get(3).getName());
    }

    @Test
    public void testingOfGetPlayerByNumber() {
        Trainer trainer = createCoTrainer();
        Team team = createMockTeam();
        Player player = trainer.getPlayerByNumber(team.getPlayers(), 1);
        Goalkeeper goalkeeper = new Goalkeeper("Torben", 25, 1, 77, 56, 66, 45, 88);

        Assert.assertSame(player.getDefending(), goalkeeper.getDefending());
    }

    @Test
    public void testCreatePlayer() {
        Team team = createMockTeam();
        Player player = team.getMainTrainer().addPlayer();

        Assert.assertEquals(1, player.getShooting());
        Assert.assertEquals(2, player.getDefending());
        Assert.assertEquals(3, player.getDribbling());
        Assert.assertEquals(4, player.getPace());
        Assert.assertEquals(5, player.getPassing());
    }

    private Team createMockTeam() {
        Team team = new Team("Real Madrid", "Primera Division");
        List<Player> playerList = new ArrayList<>();
        MainTrainer mainTrainer = new MainTrainer("Holger", 56, 99, 76);
        CoTrainer coTrainer = new CoTrainer("Roberto", 66, 86);
        Goalkeeper goalkeeper = new Goalkeeper("Torben", 25, 1, 77, 56, 66, 45, 88);
        Striker striker = new Striker("Juaanson", 27, 11, 78, 76, 67, 91, 87);
        Midfielder midfielder = new Midfielder("Don", 33, 15, 83, 94, 74, 78, 76);
        Defender defender = new Defender("Gilbert", 23, 77, 98, 65, 54, 88, 48);
        playerList.add(goalkeeper);
        playerList.add(striker);
        playerList.add(midfielder);
        playerList.add(defender);
        team.setCoTrainer(coTrainer);
        team.setMainTrainer(mainTrainer);
        team.setPlayers(playerList);
        return team;
    }

    private CoTrainer createCoTrainer() {
        return new CoTrainer("Roberto", 66, 86);
    }
}
