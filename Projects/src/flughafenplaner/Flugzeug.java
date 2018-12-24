package flughafenplaner;

public class Flugzeug {

    private String flugzeugName;
    private String modell;
    private String hersteller;

    public Flugzeug(String flugzeugName, String modell, String hersteller){
        this.flugzeugName = flugzeugName;
        this.modell = modell;
        this.hersteller = hersteller;
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
}
