//Project: Flix Bus Switzerland
//Titel: Travel.java
//Created: 07.12.2018
//Authors: Diogo Caraça & Ben Meier

package flixBusSwitzerland;

import java.util.List;

public class Travel {
    private String destination;
    private String departureTime;
    private String arrivalTime;
    //From Bus
    private String service;
    //From Platform
    private int platformNumber;
    //From Bus
    private String comfort;

    /**
     * @param destination    String
     * @param departureTime  String
     * @param arrivalTime    String
     * @param service        String
     * @param platformNumber int
     * @param comfort        String
     */
    Travel(String destination, String departureTime, String arrivalTime, String service, int platformNumber, String comfort) {
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.service = service;
        this.platformNumber = platformNumber;
        this.comfort = comfort;
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
     * @return String
     */
    public String getService() {
        return service;
    }

    /**
     * @return int
     */
    public int getPlatformNumber() {
        return platformNumber;
    }

    /**
     * @return String
     */
    public String getComfort() {
        return comfort;
    }
}
