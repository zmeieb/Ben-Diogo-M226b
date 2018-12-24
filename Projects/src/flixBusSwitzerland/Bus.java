//Project: Flix Bus Switzerland
//Titel: Bus.java
//Created: 07.12.2018
//Authors: Diogo Caraça & Ben Meier

package flixBusSwitzerland;

public class Bus {
    private int busNumber;
    private int passengerCapacity;
    private String comfort;
    private String service;
    private String size;

    /**
     * @param busNumber         int
     * @param passengerCapacity int
     * @param comfort           String
     * @param service           String
     * @param size              String
     */
    Bus(int busNumber, int passengerCapacity, String comfort, String service, String size) {
        this.busNumber = busNumber;
        this.passengerCapacity = passengerCapacity;
        this.comfort = comfort;
        this.service = service;
        this.size = size;
    }

    /**
     * @return int
     */
    public int getBusNumber() {
        return busNumber;
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

    @Override
    public String toString() {
        return "--Bus " + this.getBusNumber() + "--\n" +
                "Capacity: " + this.getPassengerCapacity() + "\n" +
                "Service: " + this.getService() + "\n" +
                "Comfort: " + this.getComfort() + "\n" +
                "Size: " + this.getSize() + "\n" +
                "------------------"
                ;
    }
}
