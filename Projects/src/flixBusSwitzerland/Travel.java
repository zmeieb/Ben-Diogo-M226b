//Project: Flix Bus Switzerland
//Titel: Travel.java
//Created: 07.12.2018
//Authors: Diogo Caraça & Ben Meier

package flixBusSwitzerland;

public class Travel {
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String busService;

    public Travel(String destination, String departureTime, String arrivalTime, String busService) {
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.busService = busService;
    }
}
