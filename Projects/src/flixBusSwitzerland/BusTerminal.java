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

    /**
     * @param terminalName String
     * @param platforms    List
     */
    BusTerminal(String terminalName, List<Platform> platforms) {
        this.terminalName = terminalName;
        this.platforms = platforms;
    }

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
     * @param travels List
     */
    public void setTravels(List<Travel> travels) {
        this.travels = travels;
    }

    public void viewDepatures(List<Platform> platforms) {
        System.out.println("============ Departures today ============");
        for (Travel travel : getTravels()) {
            System.out.println("Travel to " + travel.getDestination() + "\n" +
                    "Depature at " + travel.getDepartureTime() + "\n" +
                    "Arrival at " + travel.getArrivalTime() + "\n" +
                    "The Travel is " + travel.getService() + "\n" +
                    "The Bus has the " + travel.getComfort() + " comfort\n" +
                    "The Platform Number is " + travel.getPlatformNumber() + "\n" +
                    "------------------------------------"
            );
        }
    }
}
