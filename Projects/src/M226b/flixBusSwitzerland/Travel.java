//Project: Flix Bus Switzerland
//Titel: Travel.java
//Created: 07.12.2018
//Authors: Diogo Caraça & Ben Meier

package M226b.flixBusSwitzerland;

import java.util.ArrayList;
import java.util.List;

public class Travel {
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private Platform platform;

    /**
     * @param destination   String
     * @param departureTime String
     * @param arrivalTime   String
     * @param platform      Platform
     * @param bus           Bus
     */
    Travel(String destination, String departureTime, String arrivalTime, Platform platform, Bus bus) {
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.platform = platform;
        this.platform.setBus(bus);
        this.platform.setOccupied(true);
    }

    /**
     * @return String
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @return String
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * @return String
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * @return Platform
     */
    public Platform getPlatform() {
        return platform;
    }

    public static List<Travel> createTravels(BusTerminal terminal) {
        List<Travel> travelList = new ArrayList<>();

        Travel travel1 = new Travel("Genf", "12:00", "15:00", terminal.getPlatforms().get(0), terminal.getBuses().get(0));
        Travel travel2 = new Travel("Basel", "5:30", "7:00", terminal.getPlatforms().get(1), terminal.getBuses().get(1));
        Travel travel3 = new Travel("Crikvenica", "19:30", "7:30", terminal.getPlatforms().get(2), terminal.getBuses().get(2));
        Travel travel4 = new Travel("Milan", "14:15", "18:45", terminal.getPlatforms().get(3), terminal.getBuses().get(3));
        travelList.add(travel1);
        travelList.add(travel2);
        travelList.add(travel3);
        travelList.add(travel4);

        return travelList;
    }

    @Override
    public String toString() {
        return "--Travel to " + this.getDestination() + "--\n" +
                "Depature at " + this.getDepartureTime() + "\n" +
                "Arrival at " + this.getArrivalTime() + "\n" +
                "The Travel is " + this.getPlatform().getBus().getService() + "\n" +
                "The Bus has the " + this.getPlatform().getBus().getComfort() + " comfort\n" +
                "The Passenger Capacity is " + this.getPlatform().getBus().getPassengerCapacity() + "\n" +
                "The Platform Number is " + this.getPlatform().getPlatformNumber() + "\n" +
                "------------------------------------"
                ;
    }
}
