package flixBusSwitzerland;


import org.junit.Assert;
import org.junit.Test;


public class MainTest {

    @Test
    public void createNewTravel(){
        //Arrange
        Bus bus = new Bus(187, "1st Class");
        Travel travel = new Travel("Paris", "9:00", "13:00", "International", bus);

        //Act
        Assert.assertEquals("Paris", travel.getDestination());
        Assert.assertEquals("9:00", travel.getDepartureTime());
        Assert.assertEquals("13:00", travel.getArrivalTime());
        Assert.assertEquals("International", travel.getRegion());
    }

    @Test
    public void createNewBus(){
        Bus bus = new Bus(150, "Economy");
        int capacityForTest = 150;
        String comfortForTest = "Economy";
        Assert.assertEquals(comfortForTest, bus.getComfort());
        Assert.assertEquals(capacityForTest, bus.getPassengerCapacity());
    }

    @Test (expected = AssertionError.class)
    public void createNewTravelThatIsExpectedToFail(){
        Bus bus = new Bus(50, "1st Class");
        String[] Penis = {"Paris", "Bern", "Basel", "Zürich", "Benfica"};
        Travel travel = new Travel("Paris", "9:00", "13:00", "International", bus);
        Assert.assertEquals("Bern", travel.getDestination());
        Assert.assertEquals("10:00", travel.getDepartureTime());
        Assert.assertEquals("14:00", travel.getArrivalTime());
        Assert.assertEquals("National", travel.getRegion());
        Assert.assertEquals(150, bus.getPassengerCapacity());
        Assert.assertEquals("Economy class", bus.getComfort());


    }

    @Test
    public void createPlatform(){
        Platform platform = new Platform(7,5,"Eurobus", "Doubledecker", false);

        Assert.assertEquals(7, platform.getPlatformNumber());
        Assert.assertEquals(5, platform.getPlatformSize());
        Assert.assertEquals("Eurobus", platform.getBusService());
        Assert.assertEquals("Doubledecker", platform.getBusType());
        Assert.assertEquals(false, platform.isOccupied());
    }
}