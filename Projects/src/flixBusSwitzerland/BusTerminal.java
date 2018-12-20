//Project: Flix Bus Switzerland
//Titel: BusTerminal.java
//Created: 07.12.2018
//Authors: Diogo Caraça & Ben Meier

package flixBusSwitzerland;

import java.util.List;

public class BusTerminal {
    private String terminalName;
    private List<Platform> platforms;


    public BusTerminal(String terminalName, List<Platform> platforms) {
        this.terminalName = terminalName;
        this.platforms = platforms;
    }
}
