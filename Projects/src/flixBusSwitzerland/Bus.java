//Project: Flix Bus Switzerland
//Titel: Bus.java
//Created: 07.12.2018
//Authors: Diogo Caraça & Ben Meier

package flixBusSwitzerland;

public class Bus {
    private int passengerCapacity;
    private String comfort;
    private String service;
    private String size;

    /**
     * @param passengerCapacity int
     * @param comfort           String
     * @param service           String
     * @param size              String
     */
    Bus(int passengerCapacity, String comfort, String service, String size) {
        this.passengerCapacity = passengerCapacity;
        this.comfort = comfort;
        this.service = service;
        this.size = size;
    }

    /**
     * @return int
     */
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    /**
     * @return String
     */
    public String getComfort() {
        return comfort;
    }

    /**
     * @return String
     */
    public String getService() {
        return service;
    }

    /**
     * @return String
     */
    public String getSize() {
        return size;
    }
}
