//Project: Flix Bus Switzerland
//Titel: DoubleDecker.java
//Created: 14.12.2018
//Authors: Diogo Caraça & Ben Meier

package flixBusSwitzerland;

public class DoubleDecker extends Bus {
    private static final String SERVICE = "international";

    public DoubleDecker(int passengerCapacity, String comfort) {
        super(passengerCapacity, comfort);
    }

    public static String getSERVICE() {
        return DoubleDecker.SERVICE;
    }
}
