//Project: Flix Bus Switzerland
//Titel: Main.java
//Created: 14.12.2018
//Authors: Diogo Caraça & Ben Meierpackage flixBusSwitzerland;

package flixBusSwitzerland;


import java.util.*;

import static flixBusSwitzerland.Travel.createTravels;

public class Main {

    private static String location = "Zürich";
    private static String name = "Bus Bahnhof Zürich-West";
    private static boolean stop = true;

    public static void main(String[] args) {
        BusTerminal terminal = createBusTerminal();
        terminal.setPlatforms(createPlatforms());
        terminal.setBuses(Bus.createBuses());
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
                    terminal.generateNewTrip();
                    break;
                case "x":
                    System.out.println("See you next time!");
                    stop = false;
                    break;

                default:
                    System.out.println("User did not choose a valid option.");
                    System.out.println("Please try it again.");
                    break;
            }
        }
    }

    private static BusTerminal createBusTerminalWithLocation() {
        return BusTerminal.createBusTerminal(name, location);
    }

    private static BusTerminal createBusTerminal() {
        return BusTerminal.createBusTerminal(name);
    }

    private static List<Platform> createPlatforms() {
        List<Platform> platforms = new ArrayList<>();
        //Platform Creation
        Platform platform1 = new Platform(1, "small");
        Platform platform2 = new Platform(2, "small");
        Platform platform3 = new Platform(3, "large");
        Platform platform4 = new Platform(4, "small");
        Platform platform5 = new Platform(5, "large");
        Platform platform6 = new Platform(6, "small");
        Platform platform7 = new Platform(7, "small");
        //adding Platforms
        platforms.add(platform1);
        platforms.add(platform2);
        platforms.add(platform3);
        platforms.add(platform4);
        platforms.add(platform5);
        platforms.add(platform6);
        platforms.add(platform7);

        return platforms;
    }

}
