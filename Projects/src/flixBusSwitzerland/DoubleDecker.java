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
    DoubleDecker(int passengerCapacity, String comfort) {
        super(passengerCapacity, comfort, "international", "large");
    }
}
