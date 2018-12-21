//Project: Flix Bus Switzerland
//Titel: Main.java
//Created: 14.12.2018
//Authors: Diogo Caraça & Ben Meierpackage flixBusSwitzerland;

package flixBusSwitzerland;


import java.util.*;

public class Main {
    private static List<Travel> travelList = createTravels(createBuses());
    static boolean stop = true;
    public static void main(String[] args) {
        createBusTerminal();

        while(stop) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n\n\nChoose your action:");
            System.out.println("=========================");
            System.out.println("[1] View Departures");
            System.out.println("[2] Generate new Trip");
            System.out.println("[x] Beenden");
            String response = scanner.nextLine();
            responseHandling(response);
        }

    }

    private static void responseHandling(String response){
        switch (response){
            case "1":
                viewDepatures();
                break;
            case "2":
                generateNewTrip();
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

    private static BusTerminal createBusTerminal(){
        List<Platform> platforms = new ArrayList<>();
        //Platform Creation
        Platform platform1 = new Platform(1, 6, "international", "large", true);
        Platform platform2 = new Platform(2, 6, "national", "large", false);
        Platform platform3 = new Platform(3, 3, "international", "small", false);
        Platform platform4 = new Platform(4, 3, "national", "small", true);
        //adding Platforms
        platforms.add(platform1);
        platforms.add(platform2);
        platforms.add(platform3);
        platforms.add(platform4);
        //Bus Terminal Creation
        BusTerminal busTerminal = new BusTerminal("Bus Terminal Zürich", platforms);

        return busTerminal;
    }
    private static List<Bus> createBuses(){
        List<Bus> busList = new ArrayList<>();

        SingleFloorBus singleFloorBusLarge = new SingleFloorBus(100, "1st Class");
        SingleFloorBus singleFloorBusSmall = new SingleFloorBus(50, "Basic");
        DoubleDecker doubleDeckerLarge = new DoubleDecker(150, "1st Class");
        DoubleDecker doubleDeckerSmall = new DoubleDecker(75, "Basic");
        busList.add(singleFloorBusLarge);
        busList.add(singleFloorBusSmall);
        busList.add(doubleDeckerLarge);
        busList.add(doubleDeckerSmall);

        return busList;
    }
    private static List<Travel> createTravels(List<Bus> busList){
        List<Travel> travelList = new ArrayList<>();

        Travel travel1 = new Travel("Basel", "5:30", "7:00", "national", busList.get(1));
        Travel travel2 = new Travel("Crikvenica", "19:30", "7:30", "international", busList.get(2));
        Travel travel3 = new Travel("Milan", "14:15", "18:45", "international", busList.get(3));
        Travel travel4 = new Travel("Genf", "12:00", "15:00", "national", busList.get(0));
        travelList.add(travel1);
        travelList.add(travel2);
        travelList.add(travel3);
        travelList.add(travel4);
        return travelList;
    }


    private static void generateNewTrip(){
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
            if (travelList.add(travel)){
                System.out.println("Created new Trip succesfully");
            }
        } else if (region.equals("international")) {
            Bus bus = new DoubleDecker(capacity, comfort);
            Travel travel = new Travel(destination, departureTime, arrivalTime, region, bus);
            if (travelList.add(travel)){
                System.out.println("Created new Trip succesfully");
            }
        } else {
            Bus bus = new Bus(capacity, comfort);
            Travel travel = new Travel(destination, departureTime, arrivalTime, region, bus);
            if (travelList.add(travel)){
                System.out.println("Created new Trip succesfully");
            }
        }
    }

    private static void viewDepatures(){
        System.out.println("================ Departures today ================");
        for(Travel travel : travelList){
            System.out.println("\nTravel to " + travel.getDestination()+ ": Depature at " + travel.getDepartureTime() + " and arrives at " + travel.getArrivalTime() +" \n" +
                    "The Travel is " + travel.getRegion() + "\nThe Bus has the " + travel.getBus().getComfort() + " comfort\n" +
                    "The Bus has a capacity of " + travel.getBus().getPassengerCapacity());

        }
    }


}
