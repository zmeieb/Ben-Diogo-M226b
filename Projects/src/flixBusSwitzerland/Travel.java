//Project: Flix Bus Switzerland
//Titel: Travel.java
//Created: 07.12.2018
//Authors: Diogo Caraça & Ben Meier

package flixBusSwitzerland;

public class Travel {
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String region;
    private Bus bus;

    public Travel(String destination, String departureTime, String arrivalTime, String region, Bus bus) {
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.region = region;
        this.bus = bus;
    }



    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getRegion() {
        return region;
    }

    public Bus getBus() {
        return bus;
    }


}
