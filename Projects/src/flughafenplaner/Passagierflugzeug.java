package flughafenplaner;

public class Passagierflugzeug extends Flugzeug {

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

    public Passagierflugzeug(String flugzeugname, String modell, String flugzeuggesellschaft, int passagierPlatz) {
        super(flugzeugname, modell, "Passagierflugzeug");
        this.fluggesellschaft = flugzeuggesellschaft;
        this.passagierPlatz = passagierPlatz;
    }

    public void printPassagierFlugzeug(Passagierflugzeug passagierflugzeug){
        System.out.println("Flugzeug Name: " + passagierflugzeug.getFlugzeugName());
        System.out.println("Modell: " + passagierflugzeug.getModell());
        System.out.println("Flugzeug Name: " + passagierflugzeug.getFlugzeugName());
        System.out.println("Flugzeug Name: " + passagierflugzeug.getFlugzeugName());
        System.out.println("Flugzeug Name: " + passagierflugzeug.getFlugzeugName());
    }
}
