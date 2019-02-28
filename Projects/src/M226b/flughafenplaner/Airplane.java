package M226b.flughafenplaner;

public class Airplane {


    private String flugzeugName;
    private String modell;
    private String hersteller;
    private String airline;

    public Airplane(String flugzeugName, String modell, String hersteller, String airline) {
        this.flugzeugName = flugzeugName;
        this.modell = modell;
        this.hersteller = hersteller;
        this.airline = airline;
    }


    public String getFlugzeugName() {
        return flugzeugName;
    }

    public void setFlugzeugName(String flugzeugName) {
        this.flugzeugName = flugzeugName;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
}
