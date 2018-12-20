//Project: Flix Bus Switzerland
//Titel: Platform.java
//Created: 07.12.2018
//Authors: Diogo Caraça & Ben Meier

package flixBusSwitzerland;

public class Platform {
    private int platformNumber;
    private int platformSize;
    private String busService;
    private String busType;
    private boolean occupied;

    public Platform(int platformNumber, int platformSize, String busService, String busType, boolean occupied) {
        this.platformNumber = platformNumber;
        this.platformSize = platformSize;
        this.busService = busService;
        this.busType = busType;
        this.occupied = occupied;
    }
}
