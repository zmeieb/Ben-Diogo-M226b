//Project: Flix Bus Switzerland
//Titel: BusTerminal.java
//Created: 07.12.2018
//Authors: Diogo Caraça & Ben Meier

package flixBusSwitzerland;

import java.util.List;

public class BusTerminal {
    private String terminalName;
    private List<Platform> platforms;
    private List<Travel> travels;
    private List<Bus> buses;

    /**
     * @param terminalName String
     */
    BusTerminal(String terminalName) {
        this.terminalName = terminalName;
    }

    //Getters
    /**
     * @return String
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * @return List
     */
    public List<Platform> getPlatforms() {
        return platforms;
    }

    /**
     * @return List
     */
    public List<Travel> getTravels() {
        return travels;
    }

    /**
     * @return List
     */
    public List<Bus> getBuses() {
        return buses;
    }

    //Setters
    /**
     * @param travels List
     */
    public void setTravels(List<Travel> travels) {
        this.travels = travels;
    }

    /**
     * @param platforms List
     */
    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    /**
     * @param buses List
     */
    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

    //View Travels
    public void viewTravels() {
        System.out.println("============== Departures today ==============");
        for (Travel travel : getTravels()) {
            System.out.println("--Travel to " + travel.getDestination() + "--\n" +
                    "Depature at " + travel.getDepartureTime() + "\n" +
                    "Arrival at " + travel.getArrivalTime() + "\n" +
                    "The Travel is " + travel.getPlatform().getBus().getService() + "\n" +
                    "The Bus has the " + travel.getPlatform().getBus().getComfort() + " comfort\n" +
                    "The Passenger Capacity is " + travel.getPlatform().getBus().getPassengerCapacity() + "\n" +
                    "The Platform Number is " + travel.getPlatform().getPlatformNumber() + "\n" +
                    "------------------------------------"
            );
        }
    }
}
