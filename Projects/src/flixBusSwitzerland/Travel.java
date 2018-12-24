//Project: Flix Bus Switzerland
//Titel: Travel.java
//Created: 07.12.2018
//Authors: Diogo Caraça & Ben Meier

package flixBusSwitzerland;

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
