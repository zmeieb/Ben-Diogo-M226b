package party_manager;

import java.util.ArrayList;

public class Gastgeber extends Person {
    private ArrayList<Kontakt> kontakte;
    private ArrayList<Party> parties = new ArrayList<>();

    public Gastgeber(String vorname, String nachname, ArrayList<Kontakt> kontakte) {
        super(vorname, nachname);
        this.kontakte = kontakte;
    }

    public ArrayList<Kontakt> getKontakte() {
        return kontakte;
    }

    public ArrayList<Party> getParties() {
        return parties;
    }

    public Party createParty(String name, String datum, String zeit, String ort, Gastgeber gastgeber) {
        Party party = new Party(name, datum, zeit, ort, gastgeber);
        return party;
    }

    public Einladung createEinladung(Party party, Kontakt kontakt, boolean entscheid) {
        Einladung einladung = new Einladung(party, kontakt);
        einladung.putGast(entscheid);
        return einladung;
    }
}
