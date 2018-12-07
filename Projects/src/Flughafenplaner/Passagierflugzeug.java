package Flughafenplaner;

public class Passagierflugzeug extends Flugzeug {

    private String fluggesellschaft;
    private int passagierPlatz;

    public Passagierflugzeug(String flugzeugname, String modell, String art, String flugzeuggesellschaft, int passagierPlatz) {
        super(flugzeugname, modell, art);
        this.fluggesellschaft = flugzeuggesellschaft;
        this.passagierPlatz = passagierPlatz;

    }
}
