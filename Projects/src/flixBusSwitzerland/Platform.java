//Project: Flix Bus Switzerland
//Titel: Platform.java
//Created: 07.12.2018
//Authors: Diogo Caraça & Ben Meier

package flixBusSwitzerland;

public class Platform {
    private int platformNumber;
    private String platformSize;
    private String busService;
    private String busType;
    private boolean occupied;
    private Bus bus;


    /**
     * @param platformNumber int
     * @param platformSize   String
     */
    Platform(int platformNumber, String platformSize) {
        this.platformNumber = platformNumber;
        this.platformSize = platformSize;
        this.occupied = false;
    }

    /**
     * @param platformNumber int
     * @param platformSize   String
     * @param bus   Bus
     */
    Platform(int platformNumber, String platformSize, Bus bus) {
        this.platformNumber = platformNumber;
        this.platformSize = platformSize;
        this.busService = bus.getService();
        this.busType = bus.getSize();
        this.bus = bus;
        this.occupied = true;
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
    public String getPlatformSize() {
        return platformSize;
    }

    /**
     * @return String
     */
    public String getBusService() {
        return busService;
    }

    /**
     * @return String
     */
    public String getBusType() {
        return busType;
    }

    /**
     * @return boolean
     */
    public boolean isOccupied() {
        return occupied;
    }

    /**
     * @return Bus
     */
    public Bus getBus() {
        return bus;
    }

    /**
     * @param busService String
     */
    public void setBusService(String busService) {
        this.busService = busService;
    }

    /**
     * @param busType String
     */
    public void setBusType(String busType) {
        this.busType = busType;
    }

    /**
     * @param occupied boolean
     */
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    /**
     * @param bus Bus
     */
    public void setBus(Bus bus) {
        this.bus = bus;
    }
}
