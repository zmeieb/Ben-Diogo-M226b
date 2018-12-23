//Project: Flix Bus Switzerland
//Titel: Main.java
//Created: 14.12.2018
//Authors: Diogo Caraça & Ben Meierpackage flixBusSwitzerland;

package flixBusSwitzerland;


import java.util.*;

public class Main {
    //private static List<Travel> travelList = createTravels(createBuses());
    static boolean stop = true;

    public static void main(String[] args) {
        BusTerminal terminal = createBusTerminal("Bus Terminal Zürich");
        terminal.setPlatforms(createPlatforms());
        terminal.setBuses(createBuses());
        terminal.setTravels(createTravels(terminal));
        Scanner scanner = new Scanner(System.in);

        while (stop) {
            System.out.println("\nChoose your action:");
            System.out.println("============= " + terminal.getTerminalName() + " ============");
            System.out.println("[1] View Travels");
            System.out.println("[2] Generate new Trip");
            System.out.println("[x] End Programm");
            System.out.println("==============================================");
            String response = scanner.nextLine();

            switch (response) {
                case "1":
                    terminal.viewTravels();
                    break;
                case "2":
                    //generateNewTrip();
                    break;
                case "x":
                    System.out.println("See you next time!");
                    stop = false;
                    break;

                default:
                    System.out.println("User did not choosed a valid option.");
                    System.out.println("Please try it again.");
                    break;
            }
        }
    }


    private static BusTerminal createBusTerminal(String name) {
        BusTerminal busTerminal = new BusTerminal(name);
        return busTerminal;
    }

    private static List<Platform> createPlatforms() {
        List<Platform> platforms = new ArrayList<>();
        //Platform Creation
        Platform platform1 = new Platform(1, "small");
        Platform platform2 = new Platform(2, "small");
        Platform platform3 = new Platform(3, "large");
        Platform platform4 = new Platform(4, "small");
        //adding Platforms
        platforms.add(platform1);
        platforms.add(platform2);
        platforms.add(platform3);
        platforms.add(platform4);

        return platforms;
    }

    private static List<Bus> createBuses() {
        List<Bus> busList = new ArrayList<>();

        SingleFloorBus singleFloorBus1 = new SingleFloorBus(100, "1st Class");
        SingleFloorBus singleFloorBus2 = new SingleFloorBus(50, "Basic");
        DoubleDecker doubleDecker1 = new DoubleDecker(150, "1st Class");
        DoubleDecker doubleDecker2 = new DoubleDecker(75, "Basic");
        busList.add(singleFloorBus1);
        busList.add(singleFloorBus2);
        busList.add(doubleDecker1);
        busList.add(doubleDecker2);

        return busList;
    }

    private static List<Travel> createTravels(BusTerminal terminal) {
        List<Travel> travelList = new ArrayList<>();

        Travel travel1 = new Travel("Genf", "12:00", "15:00", terminal.getPlatforms().get(0), terminal.getBuses().get(0));
        Travel travel2 = new Travel("Basel", "5:30", "7:00", terminal.getPlatforms().get(1), terminal.getBuses().get(1));
        Travel travel3 = new Travel("Crikvenica", "19:30", "7:30", terminal.getPlatforms().get(2), terminal.getBuses().get(2));
        Travel travel4 = new Travel("Milan", "14:15", "18:45", terminal.getPlatforms().get(3), terminal.getBuses().get(3));
        travelList.add(travel1);
        travelList.add(travel2);
        travelList.add(travel3);
        travelList.add(travel4);

        return travelList;
    }

    /*
    private static void generateNewTrip() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where would you like to go? ");
        String destination = scanner.nextLine();
        System.out.println("When should be the departure time? ");
        String departureTime = scanner.nextLine();
        System.out.println("When should be the arrival time? ");
        String arrivalTime = scanner.nextLine();
        System.out.println("What kind of region is the Travel? [national/international]");
        String region = scanner.nextLine();
        System.out.println("What kind of Comfort would you like to have in your bus? [1st Class/basic]");
        String comfort = scanner.nextLine();
        System.out.println("What capacity should the bus have?");
        int capacity = scanner.nextInt();


        if (region.equals("national")) {
            Bus bus = new SingleFloorBus(capacity, comfort);
            Travel travel = new Travel(destination, departureTime, arrivalTime, region, bus);
            if (travelList.add(travel)) {
                System.out.println("Created new Trip succesfully");
            }
        } else if (region.equals("international")) {
            Bus bus = new DoubleDecker(capacity, comfort);
            Travel travel = new Travel(destination, departureTime, arrivalTime, region, bus);
            if (travelList.add(travel)) {
                System.out.println("Created new Trip succesfully");
            }
        }

    }
    */

}
