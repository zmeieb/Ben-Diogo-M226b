package M226b.flughafenplaner;

public class PassengerAirplane extends Airplane {

    private String fluggesellschaft;
    private int passagierPlatz;

    public String getFluggesellschaft() {
        return fluggesellschaft;
    }

    public void setFluggesellschaft(String fluggesellschaft) {
        this.fluggesellschaft = fluggesellschaft;
    }

    public int getPassagierPlatz() {
        return passagierPlatz;
    }

    public void setPassagierPlatz(int passagierPlatz) {
        this.passagierPlatz = passagierPlatz;
    }

    public PassengerAirplane(String flugzeugname, String modell, String flugzeuggesellschaft, int passagierPlatz) {
        super(flugzeugname, modell, "PassengerAirplane", "Edelweiss");
        this.fluggesellschaft = flugzeuggesellschaft;
        this.passagierPlatz = passagierPlatz;
    }

    public void printPassagierFlugzeug(PassengerAirplane passengerAirplane) {
        System.out.println("Airplane Name: " + passengerAirplane.getFlugzeugName());
        System.out.println("Modell: " + passengerAirplane.getModell());
        System.out.println("Airplane Name: " + passengerAirplane.getFlugzeugName());
        System.out.println("Airplane Name: " + passengerAirplane.getFlugzeugName());
        System.out.println("Airplane Name: " + passengerAirplane.getFlugzeugName());
    }
}
