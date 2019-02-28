package party_manager;

public class Gast extends Person {
    private boolean kommt;

    public Gast(String vorname, String nachname, boolean kommt) {
        super(vorname, nachname);
        this.kommt = kommt;
    }

    public boolean isKommt() {
        return kommt;
    }
}
