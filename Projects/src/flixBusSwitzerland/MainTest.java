package flixBusSwitzerland;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;



public class MainTest {

    @Test
    public void createNewTravel(){
        List<Travel> travelList = new ArrayList<>();
        Bus bus = new Bus(187, "1st Class");
        Travel travel = new Travel("Paris", "9:00", "13:00", "International", bus);
        travelList.add(travel);

        Assert.assertEquals("Paris", travel.getDestination());
        Assert.assertEquals("9:00", travel.getDepartureTime());
        Assert.assertEquals("13:00", travel.getArrivalTime());
        Assert.assertEquals("International", travel.getRegion());
    }

    @Test
    public void createNewBus(){
        Bus bus = new Bus(150, "Economy");

        Assert.assertEquals("Economy", bus.getComfort());
        Assert.assertEquals(150, bus.getPassengerCapacity());
    }

    @Test
    public void calculateTrip(){

    }
    @Test
    public void generateNewTrip(){

    }

    @Test
    public void calculatePlatforms(){

    }

    @Test
    public void doubleDeckerTest(){

    }
}