package flixBusSwitzerland;

import org.junit.Assert;
import org.junit.Test;

public class FlixBusTesting {

    @Test
        public void createNewTravel(){
            //Arrange
            Bus bus = new Bus(45, 50, "1st Class", "International", "Big");
            Platform platform = new Platform(6, "large");
            Travel travel = new Travel("Paris", "9:00", "13:00", platform, bus);
            //Act
            Assert.assertEquals("Paris", travel.getDestination());
            Assert.assertEquals("International", bus.getService());
            Assert.assertEquals("9:00", travel.getDepartureTime());
            Assert.assertEquals("13:00", travel.getArrivalTime());
            Assert.assertEquals("large", travel.getPlatform().getPlatformSize());
        }

        @Test
        public void createNewBus(){
            Bus bus = new Bus(45, 50, "1st Class", "International", "Big");
            int capacityForTest = 50;
            String comfortForTest = "1st Class";
            Assert.assertEquals(comfortForTest, bus.getComfort());
            Assert.assertEquals(comfortForTest, bus.getComfort());
            Assert.assertEquals(comfortForTest, bus.getComfort());
            Assert.assertEquals(capacityForTest, bus.getPassengerCapacity());
        }

        @Test (expected = AssertionError.class)
        public void createNewTravelThatIsExpectedToFail(){
            Bus bus = new Bus(45, 50, "1st Class", "International", "Big");
            Platform platform = new Platform(6, "large");
            Travel travel = new Travel("Paris", "9:00", "13:00", platform, bus);
            Assert.assertEquals("Bern", travel.getDestination());
            Assert.assertEquals("10:00", travel.getDepartureTime());
            Assert.assertEquals("14:00", travel.getArrivalTime());
            Assert.assertEquals("Small", travel.getPlatform().getPlatformSize());
            Assert.assertEquals(150, bus.getPassengerCapacity());
            Assert.assertEquals("Economy class", bus.getComfort());

        }

        @Test
        public void createPlatform(){
            Platform platform = new Platform(6, "large");
            Assert.assertEquals(6, platform.getPlatformNumber());
            Assert.assertEquals("large", platform.getPlatformSize());
        }

        @Test
        public void differenceBetweenBuses(){
            //Arrange
            DoubleDecker doubleDecker = new DoubleDecker(772, 35, "Economy");
            SingleFloorBus singleFloorBus = new SingleFloorBus(771, 35, "1st Class");
            String busSizeOfDoubleDecker = "large";
            String serviceOfDoubleDecker = "international";
            String busSizeOfSingleFloor= "small";
            String serviceOfSingleFloor = "national";
            //Act
            Assert.assertTrue(busSizeOfDoubleDecker.equals(doubleDecker.getSize()));
            Assert.assertTrue(serviceOfDoubleDecker.equals(doubleDecker.getService()));
            Assert.assertTrue(busSizeOfSingleFloor.equals(singleFloorBus.getSize()));
            Assert.assertTrue(serviceOfSingleFloor.equals(singleFloorBus.getService()));
        }

        @Test
        public void toStringMethodTest(){
            BusTerminal busTerminalWithLocation = new BusTerminal("Paris BusTerminal", "Paris");
            BusTerminal busTerminalWithNoLocation = new BusTerminal("Bern BusTerminal");
            Assert.assertEquals(busTerminalWithLocation.getLocation(), "Paris");
            Assert.assertFalse("Bern".equals(busTerminalWithNoLocation.getLocation()));

        }
}
