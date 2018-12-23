//Project: Flix Bus Switzerland
//Titel: SingleFloorBus.java
//Created: 14.12.2018
//Authors: Diogo Caraça & Ben Meier

package flixBusSwitzerland;

public class SingleFloorBus extends Bus {

    /**
     * @param passengerCapacity int
     * @param comfort           String
     */
    SingleFloorBus(int passengerCapacity, String comfort) {
        super(passengerCapacity, comfort, "national", "small");
    }
}
