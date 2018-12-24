//Project: Flix Bus Switzerland
//Titel: DoubleDecker.java
//Created: 14.12.2018
//Authors: Diogo Caraça & Ben Meier

package flixBusSwitzerland;

public class DoubleDecker extends Bus {

    /**
     * @param passengerCapacity int
     * @param comfort           String
     */
    DoubleDecker(int busNumber, int passengerCapacity, String comfort) {
        super(busNumber, passengerCapacity, comfort, "international", "large");
    }
}
