package party_manager;

public class Einladung {
    private Party party;
    private Kontakt kontakt;

    public Einladung(Party party, Kontakt kontakt) {
        this.party = party;
        this.kontakt = kontakt;
    }

    public boolean entscheid(boolean entscheid) {
        return entscheid;
    }

    public Gast createGast(boolean entscheid) {
        Gast gast = new Gast(this.kontakt.getVorname(), this.kontakt.getNachname(), this.entscheid(entscheid));

        return gast;
    }

    public void putGast(boolean entscheid) {
        Gast gast = this.createGast(entscheid);

        if (gast.isKommt()) {
            this.party.addKommenderGast(gast);
        } else {
            this.party.addAbwesenderGast(gast);
        }
    }
}
