//Project: Flix Bus Switzerland
//Titel: BusTerminal.java
//Created: 07.12.2018
//Authors: Diogo Caraça & Ben Meier

package flixBusSwitzerland;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusTerminal {
    private String terminalName;
    private String location;
    private List<Platform> platforms;
    private List<Travel> travels;
    private List<Bus> buses;

    /**
     * @param terminalName String
     */
    BusTerminal(String terminalName) {
        this.terminalName = terminalName;
    }
    BusTerminal(String terminalName, String location){
        this.terminalName = terminalName;
        this.location = location;
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
        System.out.println("============== Travels today ==============");
        for (Travel travel : getTravels()) {
            System.out.println(travel.toString());
        }
    }

    public void generateNewTrip() {
        List<Platform> openPlatforms = new ArrayList<>();
        Platform travelPlatform = null;
        int platformNr;
        List<Bus> openBuses = new ArrayList<>();
        Bus travelBus = null;
        int busNr;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Destination: ");
        String destination = scanner.nextLine();
        System.out.print("Departure: ");
        String departureTime = scanner.nextLine();
        System.out.print("Arrival: ");
        String arrivalTime = scanner.nextLine();

        System.out.println("Choose a platform");
        System.out.println("------------------------------------");
        for (Platform platform : this.platforms) {
            if (!platform.isOccupied()) {
                openPlatforms.add(platform);
                System.out.println(platform.toString());
            }
        }
        do {
            System.out.print("Nr: ");
            if (scanner.hasNextInt()){
                platformNr = scanner.nextInt();
                for (Platform openPlatform : openPlatforms) {
                    if (platformNr == openPlatform.getPlatformNumber()) {
                        travelPlatform = openPlatform;
                    }
                }
            } else {
                scanner.nextLine();
                System.out.println("Please enter a number");
            }
        } while (travelPlatform == null);

        System.out.println("Choose a bus");
        System.out.println("------------------------------------");
        for (Bus bus : this.buses) {
            if (travelPlatform.getPlatformSize().equals("small") && bus.getSize().equals("small")) {
                openBuses.add(bus);
                System.out.println(bus.toString());
            } else if (travelPlatform.getPlatformSize().equals("large") && bus.getSize().equals("small")) {
                openBuses.add(bus);
                System.out.println(bus.toString());
            } else if (travelPlatform.getPlatformSize().equals("large") && bus.getSize().equals("large")) {
                openBuses.add(bus);
                System.out.println(bus.toString());
            }
        }
        do {
            System.out.print("Nr: ");
            if (scanner.hasNextInt()) {
                busNr = scanner.nextInt();
                for (Bus openBus : openBuses) {
                    if (busNr == openBus.getBusNumber()) {
                        travelBus = openBus;
                    }
                }
            } else {
                scanner.nextLine();
                System.out.println("Please enter a number");
            }
        } while (travelBus == null);

        Travel travel = new Travel(destination, departureTime, arrivalTime, travelPlatform, travelBus);
        if (this.travels.add(travel)) {
            System.out.println("Created new Trip succesfully");
        }
    }
}
