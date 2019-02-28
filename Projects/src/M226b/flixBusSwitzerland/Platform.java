//Project: Flix Bus Switzerland
//Titel: Platform.java
//Created: 07.12.2018
//Authors: Diogo Caraça & Ben Meier

package M226b.flixBusSwitzerland;

public class Platform {
    private int platformNumber;
    private String platformSize;
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
        this.bus = null;
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

    @Override
    public String toString() {
        return "--Platform " + this.getPlatformNumber() + "--\n" +
                "Size: " + this.getPlatformSize() + "\n" +
                "------------------"
                ;
    }
}
