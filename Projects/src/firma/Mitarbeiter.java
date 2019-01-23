package firma;

public abstract class Mitarbeiter {

    public abstract int getMitarbeiterAnzahl();

    public void print() {

    }


    private String name;
    private int telefonNr;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getTelefonNr() {
        return telefonNr;
    }

    protected void setTelefonNr(int telefonNr) {
        this.telefonNr = telefonNr;
    }
}
