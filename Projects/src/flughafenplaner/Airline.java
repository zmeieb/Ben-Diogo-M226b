package flughafenplaner;

import java.util.ArrayList;
import java.util.List;

public class Airline {

    private String name;
    private List<Pilot> pilotList = new ArrayList();
    private List<Airplane> airPlaneList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pilot> getPilotList() {
        return pilotList;
    }

    public void setPilotList(List<Pilot> pilotList) {
        this.pilotList = pilotList;
    }

    public List<Airplane> getAirPlaneList() {
        return airPlaneList;
    }

    public void setAirPlaneList(List<Airplane> airPlaneList) {
        this.airPlaneList = airPlaneList;
    }
}
